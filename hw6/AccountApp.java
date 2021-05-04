/*Title: AccountApp.java
 * Abstract: Creating a demo class to test out the account classes
 * Date: 23th October 2020
 * */


import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double savAmount,checAmount,checFee,totalchecFee=0;
        float intRate;
        boolean flag=true;
        System.out.println("Welcome to the Account application ");
        System.out.println("\nEnter initial Checking amount: ");
        checAmount=scan.nextDouble();
        System.out.println("Enter initial Savings amount: ");
        savAmount=scan.nextDouble();
        System.out.println("Enter Checking fee: ");
        checFee=scan.nextDouble();
        System.out.println("Enter Savings interest rate: \n");
        intRate=scan.nextFloat();

        SavingsAccount savingsAccount = new SavingsAccount(intRate);
        savingsAccount.setBalance(savAmount);
        CheckingAccount checkingAccount = new CheckingAccount(checFee);
        checkingAccount.setBalance(checAmount);


        System.out.println("OK! This is your information");
        System.out.printf("Checking Amount: $%.2f \n",checkingAccount.getBalance());
        System.out.printf("Savings Amount: $%.2f \n",savingsAccount.getBalance());
        System.out.printf("Checking Fee: $%.2f \n",checkingAccount.getMonthlyFee());
        System.out.printf("Interest Rate: %d% \n\n", savingsAccount.getInterestRate());

        System.out.println("Enter the transactions for the month\n");

        while(flag==true) {
            double amt = 0;
            String choice,choice2,choice3;
            System.out.println("Withdrawal or deposit? (w/d): ");
            choice2= scan.next();
            if (choice2.equals("w")) {
                System.out.println("Checking or Savings? (c/s): ");
                choice3=scan.next();
                if (choice3.equals("c")) {
                    System.out.println("Amount?\n");
                    amt = scan.nextDouble();
                    scan.nextLine();
                    checkingAccount.withdraw(amt);
                    checkingAccount.deductFee();
                    totalchecFee+=checkingAccount.getMonthlyFee();
                    System.out.println("Continue? (y/n): \n");
                    choice = scan.next();
                    if (choice.equals("y")) {
                        continue;
                    } else if (choice.equals("n")) {
                        break;
                    }


                } else if(choice3.equals("s")) {
                    System.out.println("Amount?\n");
                    amt = scan.nextDouble();
                    scan.nextLine();
                    savingsAccount.withdraw(amt);
                    System.out.println("Continue? (y/n): \n");
                    choice = scan.next();
                    if (choice.equals("y")) {
                        continue;
                    } else if (choice.equals("n")) {
                        break;
                    }
                } else {
                    System.out.println("Invalid Choice");
                }
            }
                else if (choice2.equals("d")) {
                System.out.println("Checking or Savings? (c/s): ");
                choice3=scan.next();
                if (choice3.equals("c")) {
                    System.out.println("Amount?\n");
                    amt = scan.nextDouble();
                    scan.nextLine();
                    checkingAccount.deposit(amt);
                    checkingAccount.deductFee();
                    totalchecFee+=checkingAccount.getMonthlyFee();
                    System.out.println("Continue? (y/n): \n");
                    choice = scan.next();
                    if (choice.equals("y")) {
                        continue;

                    } else if (choice.equals("n")) {
                        break;

                    }

                } else if (choice3.equals("s")) {
                    System.out.println("Amount?\n");
                    amt = scan.nextDouble();
                    scan.nextLine();
                    savingsAccount.deposit(amt);
                    System.out.println("Continue? (y/n): \n");
                    choice = scan.next();
                    if (choice.equals("y")) {
                        continue;

                    } else if (choice.equals("n")) {
                        break;

                    }

                } else {
                    System.out.println("Invalid Choice");
                }

            } else {
                System.out.println("Invalid Choice");
            }

        }

        System.out.println("\nMonthly Payments and Fees");
        System.out.printf("Checking fee:             $%.2f \n",totalchecFee);
        System.out.printf("Savings interest payment: $%.2f \n\n",savingsAccount.getInterest());
        savingsAccount.applyInterest();


        System.out.println("Final Balances");
        System.out.printf("Checking: $%.2f \n",checkingAccount.getBalance());
        System.out.printf("Savings: $%.2f \n",savingsAccount.getBalance());


    }
}

