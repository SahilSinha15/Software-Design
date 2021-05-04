import java.util.ArrayList;
import java.util.Scanner;

public class
ArrayListDemo {



    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>(10);
        Scanner keyboard = new Scanner(System.in);
        String answer;
        boolean dec=true;
        int count=0;
        String choice;

        do{
            System.out.println("Input an Entry:");
            myList.add(keyboard.nextLine());
            count+=1;
            System.out.println("More items? (y/n)");
            choice=keyboard.nextLine();
            if(choice.equals("y")){

                continue;
            }
            else if(choice.equals("n")){
                dec=false;
                break;
            }
            else
                System.out.println("Invalid Choice ");
                break;

        }while(dec);



        //display
        System.out.println("The list contains:");
        for (String entry : myList) {
            System.out.println(entry);
        }
        //search
        System.out.println("An item to search: ");
        answer = keyboard.nextLine();
        if (myList.contains(answer)) {
            System.out.printf("%s is in the list%n", answer);
        } else {
            System.out.printf("%s is not in the list%n", answer);
        }
        //remove
        System.out.print("An item to remove: ");
        answer = keyboard.nextLine( );
        if (myList.remove(answer)) {
            System.out.printf("%s is removed from the list.%n", answer);
        } else {
            System.out.printf("%s was not in the list.%n", answer);
        }
        //display
        System.out.println("The list contains:");
        for (String entry : myList) {
            System.out.println(entry);
        }


    }

}
