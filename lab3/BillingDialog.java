public class BillingDialog {
    public static void main(String[] args) {
        System.out.println("Welcome to CSUMB software house!");
        Bill yourBill = new Bill();
        yourBill.inputTimeWorked();
        yourBill.checkCoupon();

        System.out.println("Thanks for doing business with us.");
    }
}