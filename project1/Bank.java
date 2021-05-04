/*
Title: Bank.java
Abstract: Create a Bank class to store details of customers and bank
Author: Sahil Sinha
Date: 10/10/20
*/



import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<Customer>(30);
    private ArrayList<String> customerDetails = new ArrayList<String>(), accountDetails = new ArrayList<String>();
    private static int customerCount = 0, accountCount = 0, transactionCount = 0;
    private static float total = 0;
    private String bankName;
    private Scanner fileData;
    private int numCustomers, numAccounts;

    public Bank(String s) {
        bankName = s;
    }

    public Bank() {
        bankName = "";
    }


    public void readData(String s) {
        try {
            fileData = new Scanner(new FileInputStream(s));
        } catch (FileNotFoundException e) {
            System.out.println("File not found or could not be opened.");
            System.exit(0);
        }
        numCustomers = fileData.nextInt();
        fileData.nextLine();
        for (int i = 0; i < numCustomers; i++) {
            customerDetails.add(fileData.nextLine());
        }

        numAccounts = fileData.nextInt();
        fileData.nextLine();
        for (int j = 0; j < numAccounts; j++) {
            accountDetails.add(fileData.nextLine());
            accountCount+=1;
        }

        for (String custDet : customerDetails) {
            String[] arr = custDet.split(",");
            customers.add(new Customer(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]));
            customerCount += 1;
        }

        for (Customer c : customers) {
            for (String accDet : accountDetails) {
                String[] arr = accDet.split(",");
                if (c.getSsn().equals(arr[0])) {
                    c.createAccount(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Float.parseFloat(arr[3]), c.getSsn());
                }
            }
        }


    }


    public void bankInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Number of Customers: " + customerCount);

        for (Customer c : customers) {
            if(c.getClosedStatus()){

            }
            else{
                System.out.println("     "+c.getName()+": "+c.getSsn());
            }
            }



        System.out.println("Number of Accounts: " + accountCount);
        for (Customer c : customers) {
            ArrayList<Account> arr = c.getAccounts();
            for (Account a : arr) {
                if(a.getAccType()==3){
                    continue;
                }
                else{

                System.out.printf("    %d: $%.2f",a.getAccNo(),a.getAccountBalance());
                System.out.println();
                total += a.getAccountBalance();
            }

            }
        }
        System.out.printf("Total Balance: $%.2f",total);

    }

    public void accountInfo(int n) {
        int flag=0;
        for (Customer c : customers) {
            ArrayList<Account> arr = c.getAccounts();
            for (Account a : arr) {
                if (a.getAccNo() == n) {
                    flag=1;
                    System.out.println("- Number: " + a.getAccNo());
                    if (a.getAccType() == 1)
                        System.out.println("- Checking");
                    else if (a.getAccType() == 0)
                        System.out.println("- Savings");
                    else
                        System.out.println("- Closed");
                    System.out.printf("- Balance: $%.2f", a.getAccountBalance());
                    System.out.println("\n- Customer: " + c.getName());
                }
            }
        }
        if(flag==0){
            System.out.println("Account ("+n+") does not exist");
        }
    }

    public void deposit(int n, double f) {
        for (Customer c : customers) {
            ArrayList<Account> arr = c.getAccounts();
            for (Account a : arr) {
                if (a.getAccNo() == n) {
                    a.depositBal((float) f);
                    a.makeTransaction(n, 1, f);
                    transactionCount += 1;
                }
            }
        }
    }

    public void withdraw(int n, double f) {
        for (Customer c : customers) {
            ArrayList<Account> arr = c.getAccounts();
            for (Account a : arr) {
                if (a.getAccNo() == n) {
                    a.withdrawBal((float) f);
                    a.makeTransaction(n, 2, f);
                    transactionCount += 1;
                }
            }
        }
    }

    public boolean closeAccount(int n) {
        for (Customer c : customers) {
            ArrayList<Account> arr = c.getAccounts();
            for (Account a : arr) {
                if (a.getAccNo() == n) {
                    a.closeAcc();
                    total-=a.getAccountBalance();
                    if(total<0){
                        total=0;
                    }
                    accountCount-=1;


                    return true;
                }
            }
        }
        return false;
    }


    public void transaction(int n) {
        for (Customer c : customers) {
            ArrayList<Account> arr = c.getAccounts();
            for (Account a : arr) {
                if (a.getAccNo() == n) {
                    ArrayList<Transaction> tra = a.getTransactions();
                    if (tra.size() != 0) {
                        for (Transaction t : tra) {
                            System.out.println(t);
                        }
                    } else
                        System.out.println("- No transaction for account " + n);

                }

            }
        }
    }


    public void newCustomer(String n, String a, int z, String s) {
        for (Customer c : customers) {
            if (s.equals(c.getSsn())) {
                System.out.println(n + " is NOT added - Duplicated SSN.");
                return;
            }
        }
        customers.add(new Customer(n, a, z, s));
        System.out.println(n + " is added.");
        customerCount+=1;
    }
    public void newAccount(String s, int a, int t, double b) {
        int flag = 0;
        int flag2 = 0;
        for (Customer c : customers) {
            ArrayList<Account> arr = c.getAccounts();
            for(Account acc1 : arr){
                if(acc1.getAccNo()==a){
                    System.out.println("Account creation failed - Account " + a + " already exists");
                    flag = 1;
                    return;
                }
            }
            if (s.equals(c.getSsn())) {
                for (Account acc : arr) {
                    if (acc.getAccType() == t) {
                        if (acc.getAccType() == 1) {
                            System.out.println("Account creation failed - " + c.getName() + " (" + c.getSsn() + ") already has a checking account");
                            flag = 1;
                            return;
                        } else if (acc.getAccType() == 2) {
                            System.out.println("Account creation failed - " + c.getName() + " (" + c.getSsn() + ") already has a savings account");
                            flag = 1;
                            return;
                        }
                    }
                }


                }
            }
        if(flag==0){
            for(Customer c1 : customers){
                if(s.equals(c1.getSsn())){
                    c1.createAccount(a,t, (float) b,s);
                    accountCount+=1;

                    System.out.println("Account creation - Number: "+a+", Customer: "+c1.getName());
                }
            }
        }
        for(Customer c3 : customers){
            if(c3.getSsn().equals(s)){
                flag2=1;
            }
        }
        if(flag2==0){
            System.out.println("Account creation failed - SSN does not exist");
        }


        }








        public void customerInfoWithSSN (int n){
            int custflag = 0;
            for (Customer c : customers) {

                int last4 = Integer.parseInt(c.getSsn().substring(c.getSsn().length() - 4, c.getSsn().length()));
                if (last4 == n) {
                    custflag = 1;
                    System.out.println("Name: " + c.getName());
                    System.out.println("      " + c.getAddress()+", "+c.getZip());
                    System.out.println("      SSN: " + c.getSsn());
                    ArrayList<Account> arr = c.getAccounts();
                    int accflag = 0;
                    for (Account a : arr) {
                        if (a.getAccType() == 1 ) {

                            System.out.printf("      Checking (%d) $%.2f ",a.getAccNo(),a.getAccountBalance());

                            accflag = 1;
                        } else if (a.getAccType() == 2 ) {
                            System.out.printf("     Savings (%d) $%.2f ",a.getAccNo(),a.getAccountBalance());

                            accflag = 1;
                        }
                    }
                    if (accflag == 0) {
                        System.out.println("      No Account");
                    }
                }

            }
            if (custflag == 0) {
                System.out.println("No customer with " + n);
            }

        }
        public void removeCustomer (String s){
        int flag=0;
            for(Customer c: customers){
                if(s.equals(c.getSsn())){
                    flag=1;
                    System.out.println("Customer removed - SSN: "+c.getSsn()+", Customer: "+c.getName());
                    c.setClosedStatus();
                    customerCount-=1;
                    ArrayList<Account> arr = c.getAccounts();
                    for(Account a:arr){
                            closeAccount(a.getAccNo());
                            System.out.println("  Account closed - Number: "+a.getAccNo()+", Balance: "+a.getAccountBalance());

                    }
                }
            }
            if(flag==0){
                System.out.println("Customer remove failed. SSN does not exist.");
            }

        }


    }

