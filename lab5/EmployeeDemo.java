import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Scanner keyboard = new Scanner(System.in);
        int count=0,num;
        String name,choice;
        boolean dec=true;


        do{
            System.out.println("Input a number: ");
            num=keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Input a name: ");
            name = keyboard.nextLine();
            employees.add(new Employee(num,name));
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



        System.out.println("The list contains:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }


        dec=true;



        do{
            System.out.println("Type the number and name to search");
            System.out.println("Number:");
            num=keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Name: ");
            name = keyboard.nextLine();
            Employee searchEmp = new Employee(num,name);
            int flag=0;
            for(Employee emp :employees){
                if(emp.equals(searchEmp)) {
                    System.out.println(searchEmp + " is in the list");
                    flag=1;
                    break;
                }
                else {
                    continue;
                }
            }
            if(flag==0)
                System.out.println(searchEmp + " is not in the list");
            System.out.println("More search? (y/n)");
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

        dec=true;

        do{
            System.out.println("Type the number and name to delete");
            System.out.println("Number:");
            num=keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Name: ");
            name = keyboard.nextLine();
            Employee delEmp = new Employee(num,name);
            for(Employee emp :employees){
                if(emp.equals(delEmp)){
                    employees.remove(emp);
                    System.out.println(emp+" has been removed from the list");
                    System.out.println("The list contains:");
                    for (Employee emp2 : employees) {
                        System.out.println(emp2);
                    }
                    break;
                }
                else{
                    System.out.println("Invalid Entry");
                    break;
                }
            }

            System.out.println("More remove? (y/n)");
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


        System.out.println("The list contains:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }




    }





    }

