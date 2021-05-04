/*Title: SavingsAccount.java
 * Abstract: Creating a savings account class which inherits account class
 * Date: 23th October 2020
 * */


public class SavingsAccount extends Account {
    private float interestRate=0;
    private double interestPayment=0;


    public SavingsAccount(float r){
        interestRate=r;
    }

    public SavingsAccount(){}

    public void applyInterest(){
       double b = this.getBalance();
       this.setBalance(b+(b*interestRate));
    }
    public int getInterestRate(){
        return (int)(interestRate*100);
    }

    public double getInterest(){
        return (this.getBalance()*interestRate);
    }


}
