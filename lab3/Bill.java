import java.util.Scanner;

public class Bill {

    private int hr,min,totalmins,coup;
    private float bill;
    Scanner keyboard = new Scanner(System.in);

    public void inputTimeWorked(){
        System.out.println("Enter number of full hours worked\n" +
                "followed by number of minutes: ");

        hr= keyboard.nextInt();
        min = keyboard.nextInt();

        System.out.println("Time Worked: ");
        System.out.println(hr+" Hours and "+min+" Minutes");
    }

    public void updateFee(){
        System.out.println("Rate: $150.0 per quarter hour");
        totalmins = (hr*60)+min;
        outputBill();
    }
    public void outputBill(){
        bill = (float) ((totalmins/15)*150.0);
        System.out.println("Amount Due: "+bill);
    }

    public void checkCoupon(){
        System.out.println("Enter a coupon number: ");
        coup = keyboard.nextInt();
        if(coup == 1234){
            System.out.println("Your coupon is valid. (10% discount)");
            System.out.println("Rate: $135.0 per quarter hour");
            totalmins = (hr*60)+min;
            bill = (float) ((totalmins/15)*135.0);
            System.out.println("Amount Due: "+bill);
        }
        else{
            System.out.println("Your coupon is invalid");
            updateFee();
        }
    }
}
