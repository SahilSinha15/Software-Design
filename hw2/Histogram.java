// File Name-  Histogram.java
// Abstract- Accept numbers from user and plot a histogram using asterisks
// Author- Sahil Sinha
// Date- 09/09/20

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        int[] c = new int[10];
                                //using function calls to better organise the code.
        c = takeInput();        //takeInput() function takes the required input from user.
        printNumOcc(c);         //printNumOcc() function prints the Number/Occurrence table.
        printHistogram(c);      //printHistogram() function prints the histogram.
                    //printNumOcc() and printHistogram() take an array of counts(occurrences).

    }


    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("How many numbers?");
        a = sc.nextInt();

        int[] num = new int[a];                           //taking input
        int[] counts = new int[10];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {          //creating an array to store counts of digits 0 to 9.
            int c = 0;
            for (int j : num) {                 //evaluate count of each single digit.
                if (i == j) {
                    c++;
                } else {
                    continue;
                }
            }
            counts[i] = c;                      //store count in the array and move to next digit.


        }
        return counts;
    }

    public static void printNumOcc(int[] b){
        System.out.println("\n\n\n");
        System.out.println("Numbers     Occurrences");          //printing the num/occ table
        for(int k=0;k<10;k++){
            System.out.println("   "+k+"             "+b[k]);
    }
    }

    public static void printHistogram(int[] l){
        int maxval=0;

        for(int i : l){     //finding largest value in count array to determine number of rows
            if(i>maxval){
                maxval=i;
            }

        }
        int max=maxval;                        //created copy for decrement
        System.out.println("\n\n\n");
        System.out.println("==========Vertical Bar==========");     //printing the histogram


        for(int q=0;q<max;q++){                 //loop for rows(0- max count entry of the array).
            System.out.print("| "+maxval--+"  |"); //printing the row number starting from max and decrementing.
            for(int w=0;w<10;w++){            //loop for each column(0-10).
                if(l[w]>maxval) {        //check if the value of count of each digit is greater than max value.
                    System.out.print(" *");   // if yes print asterisk
                }
                else{
                    System.out.print("  ");  // if no then print blank space.
                }
            }
            System.out.print("\n");

        }



        System.out.println("================================");
        System.out.println("| No | 0 1 2 3 4 5 6 7 8 9 ");


    }






    }

