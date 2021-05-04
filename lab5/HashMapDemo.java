import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, Employee> empHash = new HashMap<Integer, Employee>();
        int key;
        String name,choice;
        float number;
        boolean dec=true;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Input a key");
            key= scan.nextInt();
            scan.nextLine();
            System.out.println("Input a name");
            name=scan.nextLine();
            System.out.println("Input a number");
            number= scan.nextFloat();
            if(empHash.containsKey(key)){
                System.out.println("Input Error! Key "+key+" already exists.");
            }
            else {
                empHash.put(key, new Employee(name, number));
            }
            System.out.println("More items? (y/n)");
            scan.nextLine();
            choice=scan.nextLine();
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

        dec=true;

        do{
            System.out.println("A key to search: ");
            int searchKey = scan.nextInt();
            scan.nextLine();
            if(empHash.containsKey(searchKey)) {
                System.out.println("The key "+searchKey+" has the value "+empHash.get(searchKey).display()+" in the HashMap");
                }
            else
                System.out.println("The key "+searchKey+" doesn't exist at the HasMap");

            System.out.println("More items? (y/n)");
            choice=scan.nextLine();
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

        dec=true;

        do{
            System.out.println("A key to remove");
            int remKey = scan.nextInt();
            if(empHash.containsKey(remKey)){
                System.out.println("The value "+empHash.get(remKey).display()+"of key "+remKey+" is removed from the HashMap");
                empHash.remove(remKey);
            }
            else
                System.out.println("Key does not exist");

        }while(dec);



    }

}
