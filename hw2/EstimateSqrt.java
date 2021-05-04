// File Name-  EstimateSqrt.java
// Abstract- Accept a whole number from user and estimate its root.
// Author- Sahil Sinha
// Date- 09/09/20


import java.util.InputMismatchException;
import java.util.Scanner;

public class EstimateSqrt {

    public static void main(String[] args) {
        sqrtEst();    //  using a function to simplify the whole number checks and consecutive runs.
    }

        public static void sqrtEst(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a whole number");
            int n = sc.nextInt();
            int c = 3;             // initialized variable c to keep track of guess #.
            float x0, x1, x2;
            x0 = n / 2;

            x1 = ((x0 + (n / x0)) / 2);
            System.out.println("Guess #1 = " + x1);
            x2 = ((x1 + (n / x1)) / 2);
            System.out.println("Guess #2 = " + x2); // process and print the first two guesses to perform
                                                    // following while loop check.

            while (((x1 - x2) / x1) >= 0.01) {
                x1 = x2;
                x2 = ((x1 + (n / x1)) / 2);
                System.out.println("Guess #" + c + " = " + x2);
                c++;
            }
            System.out.println();

            System.out.printf("The estimated square root of %d is %.2f ", n, x2); //using printf to print only
                                                                                  // 2 digits after decimal.

        } catch (InputMismatchException e) {
            System.out.println("The entered number is not a whole number.");    //Exception handling to enforce
                                                                                //a whole number input.
            sqrtEst();

        }


        }

    }



