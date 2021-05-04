/*
Title: Customer.java
Abstract: Create a Customer class to store details of customers and accounts.
Author: Sahil Sinha
Date: 10/10/20
*/




import java.util.ArrayList;

public class Customer {
    private ArrayList<Account> accounts = new ArrayList<Account>(2);
    private String name,address,ssn;
    private int zip,accCount=0;
    private  boolean closeStatus = false;

    public Customer(String Name,String Address,int Zip,String Ssn){
        name=Name;
        address=Address;
        zip=Zip;
        ssn=Ssn;
    }
    public String toString(){
        return name+" "+address+" "+zip+" "+ssn;

    }

    public String getSsn() {
        return ssn;
    }

    public void createAccount(int accN,int accT,float sal,String ssn){
        if(accCount==2){
            System.out.println("No more accounts can be created.");
            System.exit(0);
        }
        else{
            accounts.add(new Account(accN,accT,sal,ssn));
        }

    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getZip(){
        return zip;
    }

    public void setClosedStatus() {
        closeStatus=true;
    }

    public boolean getClosedStatus(){
        return closeStatus;
    }
}


