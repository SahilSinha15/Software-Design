import java.util.Scanner;

public class Employee {
    private int idNum;
    private String firstName, lastName;
    float score;

    public Employee(int n,String s){
        idNum=n;
        firstName=s;
    }

    public Employee(String s, float f){
        firstName=s;
        score=f;
    }

    @Override
    public String toString() {
        return idNum+" "+firstName;
    }

    public boolean equals(Object o){
        if(o instanceof Employee) {
            Employee temp = (Employee) o;
            return ((this.idNum==temp.idNum)&&(this.firstName.equals(((Employee) o).firstName)));
        }
        else
            return false;
    }

    public float getScore() {
        return score;
    }

    public String display(){
       return firstName+" "+score+" ";
    }
}