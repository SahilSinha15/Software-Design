import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class GameCar {

    private String carName,carColor;
    private int carPos;

    public GameCar(){
        carName = "";
        carColor = "";
        carPos = 0;

    }

    public GameCar(String name, String color, int position){
        carName = name;
        carColor = color;
        carPos = position;
        
    }

    public void getCarInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car name: ");
        carName = sc.nextLine();
        System.out.println("Enter the car colour: ");
        carColor = sc.nextLine();
        System.out.println("Enter the car position: ");
        carPos = sc.nextInt();

    }

    public void moveForward(int n){
        carPos += n;
    }
    public void setColor(String s){
        carColor =  s;
    }
    public void setCar(String name, String color, int position){
        carName = name;
        carColor = color;
        carPos = position;


    }


    public void moveBackward(int n){
        carPos -= n;
    }

    public void race(GameCar anotherCar){
        if(carPos> anotherCar.carPos){
            System.out.println(carName+" win: "+carName+" ("+carPos+") vs. "+anotherCar.carName+ " ("+anotherCar.carPos+") ");
        }
        else if(anotherCar.carPos> carPos){
            System.out.println(anotherCar.carName+" win: "+anotherCar.carName+" ("+anotherCar.carPos+") vs. "+carName+ " ("+carPos+") ");
        }
        else{
            System.out.println("Tie");
        }

    }

    public String toString(){
        return("Car Information: "+carName+" ("+carColor+"), Current Postition: "+carPos);

    }

    public boolean equals (GameCar o) {
        if (o.carColor == carColor && o.carName == carName && o.carPos == carPos) {
            return true;
        } else {
            return false;
        }
    }





}
