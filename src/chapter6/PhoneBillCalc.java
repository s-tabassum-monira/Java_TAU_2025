package chapter6;

public class PhoneBillCalc {
    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill(1234);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();
    }
}
