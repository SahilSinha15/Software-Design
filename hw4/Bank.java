//Title: Bank
//Abstract: Creating a bank class with 5 Account objects to store details
//Author: Sahil Sinha
//Date: 09/26/20



public class Bank {
    private String name;
    private Account[] accounts = new Account[5];
    private int accountsTaken=0;
    private double total=0;


    public Bank(String s){
        name=s;
        for(int i=0;i<5;i++){
            accounts[i]=new Account();
        }
    }
    public boolean openAccount(String n,String a,int s,int acn,int act,double bal){
        if(accountsTaken>5 ){
            return false;
        }
        else{
            accounts[accountsTaken].setAccNum(acn);
            accounts[accountsTaken].setName(n);
            accounts[accountsTaken].setAddress(a);
            accounts[accountsTaken].setAccType(act);
            accounts[accountsTaken].setBalance(bal);
            accounts[accountsTaken].setSsn(s);
            accountsTaken+=1;
            return true;
        }
    }
    public boolean closeAccount(int acn){
        for(int i=0;i<5;i++){
            if(accounts[accountsTaken].getAccNum()==acn){
                accounts[accountsTaken]=accounts[accountsTaken+1];
                accounts[accountsTaken]=new Account();
                accountsTaken-=1;
                return true;
            }
        }
        return false;
    }
    public boolean updateAddress(int acn,String a){
        for(int i=0;i<5;i++){
            if(accounts[accountsTaken].getAccNum()==acn){
                accounts[accountsTaken].setAddress(a);
                return true;
            }
            else
                return false;
        }
        return false;
    }
    public boolean updateBalance(int acn,int bal){
        for(int i=0;i<5;i++) {
            if (accounts[accountsTaken].getAccNum() == acn) {
                if (accounts[accountsTaken].getBalance() < 0)
                    return false;
                else {
                    accounts[accountsTaken].setBalance(bal);
                    return true;
                }
            }
        }
        return false;
    }
    public void bankInfo(){
        System.out.println(String.format("Bank Name: %s",name));
        System.out.println(String.format("Number of Accounts: %d",accountsTaken));
        for(int i=0;i<accountsTaken;i++){
            System.out.println(String.format("%d: %.2f - %s: %d",accounts[i].getAccNum(),accounts[i].getBalance(),accounts[i].getName(),accounts[i].getssn()));
            total+=accounts[i].getBalance();
        }
        System.out.println(String.format("Bank Total Balance: %.2f\n",total));
    }
    public boolean accountInfo(int acn){
        for(int i=0;i<5;i++) {
            if (accounts[accountsTaken].getAccNum() == acn) {
                if(accounts[accountsTaken].getAccType()==1)
                    System.out.println(String.format("Account Info:Account Number: %d\n Checking account\n Balance: %.2f\n Customer: %s\n %s\n SSN: %d",accounts[i].getAccNum(),accounts[i].getBalance(),accounts[i].getName(),accounts[i].getAddress(),accounts[i].getssn()));
                else
                    System.out.println(String.format("Account Info:Account Number: %d\n Savings account\n Balance: %.2f\n Customer: %s\n %s\n SSN: %d",accounts[i].getAccNum(),accounts[i].getBalance(),accounts[i].getName(),accounts[i].getAddress(),accounts[i].getssn()));
                return true;
            }

        }

        return false;
    }


}
