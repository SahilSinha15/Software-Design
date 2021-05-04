/*
 * Title: Person.java
 * Abstract: Create person class to store details like first name,last name,and know if they have a license.
 * Author: Sahil Sinha
 * Date: 10/17/20                             */






public class Person {
        String fname,lname;
        boolean hasLicense;

        public Person(String n, String l,boolean bool){
            fname=n;
            lname=l;
            hasLicense=bool;
        }

        public Person(Person p){
            fname=p.fname;
            lname=p.lname;
            hasLicense=p.hasLicense;

        }

    @Override
    public String toString() {
            if(hasLicense)
                return fname+" "+lname+" has a driver's license. ";
            else
                return fname+" "+lname+" does not have a driver's license. ";

    }

    @Override
    public boolean equals(Object o){
            Person temp = new Person((Person) o);
            if(((Person) o).fname.equals(this.fname)&& ((Person) o).lname.equals(this.lname)){
                return true;
            }
            else{
                return false;
            }
    }
    public void lostLicense(){
            hasLicense= false;
    }
}
