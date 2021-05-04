/*
* Title: Vehicle.java
* Abstract: Create vehicle class to store details like make,model,owner.
* Author: Sahil Sinha
* Date: 10/17/20                             */



public class Vehicle {
    private String make,model;
    private Person owner;
    private double testEperM;


    public Vehicle(String ma, String mo,double t){
        make=ma;
        model=mo;
        testEperM=t;

    }

    public Vehicle(Vehicle v){
        make=v.make;
        model=v.model;
        testEperM=v.testEperM;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void checkEmissionsData(float a,float b){

        if((testEperM+.2)>(a/b)){
            System.out.printf("\nThe %s %s, owned by %s, is street legal, with emissions per mile of %.2f " ,make,model,owner.fname,(float)(a/b));
        }
        else{
            System.out.printf("\nThe %s %s, owned by %s, is not street legal, with emissions per mile of %.2f " ,make,model,owner.fname,(float)(a/b));

        }
    }

    @Override
    public String toString(){
        return "";
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner.fname+" "+owner.lname;
    }
}
