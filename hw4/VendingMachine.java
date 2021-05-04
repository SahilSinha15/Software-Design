//Title: VendingMachine
//Abstract: Create vending machine class to implement functionality
//Author: Sahil Sinha
//Date: 9/24/20


import java.util.Scanner;

public class VendingMachine {
    private int serialNo;
    private int countWater, countCoffee, countChips, countChocBar;
    private int itemNo = 0, itemQuant = 0;
    private int soldWater, soldCoffee, soldChips, soldChocBar;
    private float paymentAmount, total=0,tenPercent;
    private String location,output;
    Scanner sc = new Scanner(System.in);


    public VendingMachine(int n, String s) {
        serialNo = n;
        location = s;
        soldWater = 0;
        soldCoffee = 0;
        soldChips = 0;
        soldChocBar = 0;
    }

    public VendingMachine(int n) {
        serialNo = n;
        location = "UNKNOWN";
        soldWater = 0;
        soldCoffee = 0;
        soldChips = 0;
        soldChocBar = 0;
    }

    public void setLocation(String l) {
        location = l;
    }

    public void setName(int i) {
        serialNo = i;
    }

    public void reset(int countW, int countCo, int countCh, int countCb) {       //These indicate counts of Water,Coffee,Chips and Chocolate respectively
        countWater = countW;
        countCoffee = countCo;
        countChips = countCh;
        countChocBar = countCb;

    }

    public void addItems(int countW, int countCo, int countCh, int countCb) {
        countWater += countW;
        countCoffee += countCo;
        countChips += countCh;
        countChocBar += countCb;

    }

    public void displayMenu() {
        System.out.println("===== Vending Machine Menu =====");
        System.out.println("  1. Water............$1.50     ");
        System.out.println("  2. Regular Coffee...$2.00     ");
        System.out.println("  3. Sun Chips........$1.00     ");
        System.out.println("  4. Chocolate Bar....$2.50     ");

    }

    public boolean buyItem() {
        System.out.println("Enter the item number: ");
        itemNo = sc.nextInt();
        System.out.println("How many do you want to buy? ");
        itemQuant = sc.nextInt();


        switch (itemNo) {
            case 1: {
                if (countWater >= itemQuant) {
                    countWater -= itemQuant;
                    System.out.println("You selected Water. Quantity: " + itemQuant);
                    soldWater += itemQuant;
                    itemQuant = 0;
                    itemNo = 0;
                    return true;

                } else {
                    System.out.println("You selected water. Quantity: " + itemQuant);
                    System.out.println("Selection failed. We don't have enough Water.");
                    itemQuant = 0;
                    itemNo = 0;
                    return false;
                }
            }
            case 2: {
                if (countCoffee >= itemQuant) {
                    countCoffee -= itemQuant;
                    System.out.println("You selected Regular Coffee. Quantity: " + itemQuant);
                    soldCoffee += itemQuant;
                    itemQuant = 0;
                    itemNo = 0;
                    return true;
                } else {
                    System.out.println("You selected Regular Coffee. Quantity: " + itemQuant);
                    System.out.println("Selection failed. We don't have enough Regular Coffee.");
                    itemQuant = 0;
                    itemNo = 0;
                    return false;
                }


            }
            case 3: {
                if (countChips >= itemQuant) {
                    countChips -= itemQuant;
                    System.out.println("You selected Sun Chips. Quantity: " + itemQuant);
                    soldChips += itemQuant;
                    itemQuant = 0;
                    itemNo = 0;
                    return true;
                } else {
                    System.out.println("You selected Sun Chips. Quantity: " + itemQuant);
                    System.out.println("Selection failed. We don't have enough Sun Chips.");
                    itemQuant = 0;
                    itemNo = 0;
                    return false;
                }


            }
            case 4: {
                if (countChocBar >= itemQuant) {
                    countChocBar -= itemQuant;
                    System.out.println("You selected Chocolate Bar. Quantity: " + itemQuant);
                    soldChocBar += itemQuant;
                    itemQuant = 0;
                    itemNo = 0;
                    return true;
                } else {
                    System.out.println("You selected Chocolate Bar. Quantity: " + itemQuant);
                    System.out.println("Selection failed. We don't have enough Chocolate Bar.");
                    itemQuant = 0;
                    itemNo = 0;
                    return false;
                }


            }
            default: {
                System.out.println("Invalid Choice");
                System.out.println("Please try again");
                return false;
            }

        }


    }

    public boolean buyItem(int itemNo, int itemQuant) {
        this.itemNo = itemNo;
        this.itemQuant = itemQuant;
        System.out.println("Enter the item number: ");
        System.out.println(itemNo);
        System.out.println("How many do you want to buy? ");
        System.out.println(itemQuant);

        switch (itemNo) {
            case 1: {
                if (countWater >= itemQuant) {
                    countWater -= itemQuant;
                    System.out.println("You selected Water. Quantity: " + itemQuant);
                    soldWater += itemQuant;
                    itemQuant = 0;
                    itemNo = 0;
                    return true;

                } else {
                    System.out.println("You selected water. Quantity: " + itemQuant);
                    System.out.println("Selection failed. We don't have enough Water.");
                    itemQuant = 0;
                    itemNo = 0;
                    return false;
                }
            }
            case 2: {
                if (countCoffee >= itemQuant) {
                    countCoffee -= itemQuant;
                    System.out.println("You selected Regular Coffee. Quantity: " + itemQuant);
                    soldCoffee += itemQuant;
                    itemQuant = 0;
                    itemNo = 0;
                    return true;
                } else {
                    System.out.println("You selected Regular Coffee. Quantity: " + itemQuant);
                    System.out.println("Selection failed. We don't have enough Regular Coffee.");
                    itemQuant = 0;
                    itemNo = 0;
                    return false;
                }


            }
            case 3: {
                if (countChips >= itemQuant) {
                    countChips -= itemQuant;
                    System.out.println("You selected Sun Chips. Quantity: " + itemQuant);
                    soldChips += itemQuant;
                    itemQuant = 0;
                    itemNo = 0;
                    return true;
                } else {
                    System.out.println("You selected Sun Chips. Quantity: " + itemQuant);
                    System.out.println("Selection failed. We don't have enough Sun Chips.");
                    itemQuant = 0;
                    itemNo = 0;
                    return false;
                }


            }
            case 4: {
                if (countChocBar >= itemQuant) {
                    countChocBar -= itemQuant;
                    System.out.println("You selected Chocolate Bar. Quantity: " + itemQuant);
                    soldChocBar += itemQuant;
                    itemQuant = 0;
                    itemNo = 0;
                    return true;
                } else {
                    System.out.println("You selected Chocolate Bar. Quantity: " + itemQuant);
                    System.out.println("Selection failed. We don't have enough Chocolate Bar.");
                    itemQuant = 0;
                    itemNo = 0;
                    return false;
                }


            }
            default: {
                System.out.println("Invalid Choice");
                System.out.println("Please try again");
                return false;
            }


        }

    }

    public void returned(int a, int b) {
        switch(a) {
            case 1: {
                System.out.println("You selected Water. Quantity: "+b);
                countWater += b;
                soldWater -= b;
                break;
            }
            case 2: {
                System.out.println("You selected Regular Coffee. Quantity: "+b);
                countCoffee += b;
                soldCoffee -= b;
                break;
            }
            case 3: {
                System.out.println("You selected Sun Chips. Quantity: "+b);
                countChips += b;
                soldChips -= b;
                break;
            }
            case 4: {
                System.out.println("You selected Chocolate Bar. Quantity: "+b);
                countChocBar += b;
                soldChocBar -= b;
                break;
            }
            default:
                System.out.println("Invalid Choice");
        }
    }

        public boolean payment() {

            System.out.println("Enter money amount: ");
            paymentAmount = sc.nextFloat();
            System.out.print("$" + paymentAmount);
            total = 0;
            total += ((soldWater * 1.5) + (soldCoffee * 2) +soldChips+ (soldChocBar * 2.5));
            total += total/10;
            if (total <= paymentAmount) {
                System.out.println("\nSufficient money. $" + (paymentAmount - total) + " returned");
                return true;
            }
            else {
                System.out.println("\nInsufficient money. $" + paymentAmount + " returned");
                return false;
            }

        }
        public void displayReceipt(){
            total=0;
            total+=(soldWater*1.5);
            total+=(soldCoffee*2);
            total+=(soldChips*1);
            total+=(soldChocBar*2.5);
            tenPercent=total/10;
            total+=tenPercent;
            if(soldWater>=1)
                System.out.println("Water: $1.50 X "+soldWater+" = "+(soldWater * 1.5));
            if(soldCoffee>=1)
                System.out.println("Regular Coffee: $2.00 X "+soldCoffee+" = "+(soldCoffee * 2));
            if(soldChips>=1)
                System.out.println("Sun Chips: $1.00 X "+soldChips+" = "+soldChips);
            if(soldChocBar>=1)
                System.out.println("Chocolate Bar: $2.50 X "+soldChocBar+" = "+(soldChocBar * 2.5));
            System.out.println("Tax (10%): $"+tenPercent);
            System.out.println("Total: $"+total);

        }

        public void status(){
            System.out.println("Serial Number: "+serialNo);
            System.out.println("Location: "+location);
            System.out.println("Sold items: ");
            System.out.println("   Water: "+soldWater);
            System.out.println("   Regular Coffee: "+soldCoffee);
            System.out.println("   Sun Chips: "+soldChips);
            System.out.println("   Chocolate Bar: "+soldChocBar);
            System.out.println("Current Contents: ");
            System.out.println("   Water: "+countWater);
            System.out.println("   Water: "+countCoffee);
            System.out.println("   Water: "+countChips);
            System.out.println("   Water: "+countChocBar);
            System.out.println("Total Earning: $"+total);
        }

    @Override
    public String toString() {
        output="Serial Number: "+serialNo+"\n"+"Location: "+location+"\n"+"Contents: "+"\n"+"   Water: "+countWater+"\n"+"   Regular Coffee: "+countCoffee+"\n"+"   Sun Chips: "+countChips+"\n"+"   Chocolate Bar: "+countChocBar;
        return output;
    }
}
