//Title: Bank
//Abstract: Creating a customer class to finally store personal details like ssn and address.
//Author: Sahil Sinha
//Date: 09/26/20




public class Customer {
    private String name,address;
    private int ssn;


    public int getSsn(){
        return ssn;
    }
    public void setssn(int a){
        ssn=a;
    }
    public String getname(){
        return name;
    }
    public void setname(String s){
        name=s;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String s){
        address=s;
    }
}
