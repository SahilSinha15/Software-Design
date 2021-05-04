/*
 * Title: Truck.java
 * Abstract: Create truck class which inherits Vehicle to store details like load capacity,tow capacity.
 * Author: Sahil Sinha
 * Date: 10/17/20                             */




public class Truck extends Vehicle{
    private double loadCapacity;
    private int towingCapacity;

    public Truck(String ma, String mo, double t,double t2,int tow) {
        super(ma, mo, t);
        loadCapacity=t2;
        loadCapacity=tow;
    }

    @Override
    public String toString() {
        return "";
    }
}
