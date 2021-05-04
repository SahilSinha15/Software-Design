/*Title: CheckingAccount.java
 * Abstract: Creating a checking account class which inherits account class
 * Date: 23th October 2020
 * */


public class CheckingAccount extends Account {
    private double monthlyFee;


    public CheckingAccount(){

    }

    public CheckingAccount(double b){
        monthlyFee=b;
    }


    public double getMonthlyFee(){
        return monthlyFee;
    }

    public void deductFee(){
        this.setBalance((this.getBalance())-monthlyFee);
    }
}
