/*
Title: Account.java
Abstract: Create an Account class to store details of transactions and accounts.
Author: Sahil Sinha
Date: 10/10/20
*/

import java.util.ArrayList;

public class Account {
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>(100);
    private String ssn;
    private int accountNo,accountType;
    private float accountBalance;


    public Account(int accN, int accT, float sal,String ssn) {
        accountNo=accN;
        accountType=accT;
        accountBalance=sal;
        this.ssn = ssn;

    }

    public String toString(){
        return ssn+" "+accountNo+" "+accountType+" "+accountBalance;
    }

    public String getSsn() {
        return ssn;
    }

    public int getAccNo() {
        return accountNo;
    }


    public float getAccountBalance() {
        return accountBalance;
    }

    public int getAccType() {
        return accountType;
    }

    public void depositBal(float f) {
        accountBalance+=f;
    }

    public void withdrawBal(float f) {
        accountBalance-=f;
    }

    public void makeTransaction(int n, int i, double f) {
        transactions.add(new Transaction(n,i,f));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void closeAcc() {
        accountType=3;
        transactions.add(new Transaction(this.getAccNo(),accountType));
    }
}
