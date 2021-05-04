/*Title: Account.java
 * Abstract: Creating a class which implements the interfaces to make an account
 * Date: 23th October 2020
 * */



public class Account implements Depositable,Withdrawable,Balanceable{
    private double bal=0;


    @Override
    public double getBalance() {
        return bal;
    }

    @Override
    public void setBalance(double amount) {
        bal=amount;
    }

    @Override
    public void deposit(double amount) {
        bal+=amount;
    }

    @Override
    public void withdraw(double amount) {
        if(bal>=amount)
            bal-=amount;

    }
}
