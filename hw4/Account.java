//Title: Bank
//Abstract: Creating an account class with customer objects to store details and provide details to bank class
//Author: Sahil Sinha
//Date: 09/26/20



public class Account {
    private int accNum,accType;
    private Customer accountholder = new Customer();
    private double balance;


    public int getssn(){
        return accountholder.getSsn();
    }

    public int getAccNum(){
        return accNum;
    }

    public int getAccType(){
        return accType;

    }

    public double getBalance(){
        return balance;
    }

    public void setAccNum(int a){
        accNum=a;
    }
    public void setAccType(int a){
        accType=a;
    }
    public void setBalance(double a){
        balance=a;
    }

    public void setAddress(String s){
        accountholder.setaddress(s);
    }

    public void setName(String s){
        accountholder.setname(s);
    }

    public void setSsn(int a){
        accountholder.setssn(a);
    }

    public String getName(){
        return accountholder.getname();
    }

    public String getAddress(){
        return accountholder.getaddress();
    }
}
