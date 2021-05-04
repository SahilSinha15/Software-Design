/*
Title: Transaction.java
Abstract: Create a Customer class to store details of transactions and time.
Author: Sahil Sinha
Date: 10/10/20
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Transaction {
    private int accountNo,transactionType;
    private String dateTime;
    private double amount;
    private LocalDateTime now;

    public Transaction(int a, int t, double f){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
        now = LocalDateTime.now();
        dateTime = now.format(formatter);
        accountNo=a;
        transactionType=t;
        amount=f;
    }

    public Transaction(int accNo, int accountType) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
        now = LocalDateTime.now();
        dateTime = now.format(formatter);
        accountNo=accNo;
        transactionType=accountType;

    }

    public String toString(){

        if(transactionType==1)
            return "- Account Number: "+accountNo+", Deposit ($"+amount+"), "+dateTime;
        else if(transactionType==2)
            return "- Account Number: "+accountNo+", Withdraw ($"+amount+"), "+dateTime;
        else
            return "- Account Number: "+accountNo+", Account Closed, "+dateTime;


    }


}
