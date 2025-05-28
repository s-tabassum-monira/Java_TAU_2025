package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double costPerOverageMin = 0.25;
    static double taxOnSubTotal = 0.15;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter base cost of the plan: ");
        double baseCostStored = scanner.nextDouble();

        System.out.println("Enter overage minutes: ");
        double overageMinutesStored = scanner.nextDouble();
        scanner.close();
        PhoneBillCalculator phoneBillCal = new PhoneBillCalculator();

        double overageFeesCalculatedStored = phoneBillCal.calculateOverageFees(overageMinutesStored);

        double subTotal = overageFeesCalculatedStored + baseCostStored;
        double taxCalculatedStored = phoneBillCal.calculateTax(subTotal);
        double totalPhoneBill = phoneBillCal.calculateFinalTotal(baseCostStored,overageFeesCalculatedStored,taxCalculatedStored);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f",baseCostStored));
        System.out.println("Overage: $" + String.format("%.2f",overageFeesCalculatedStored));
        System.out.println("Tax: $" + String.format("%.2f",taxCalculatedStored));
        System.out.println("Total: $" + String.format("%.2f",totalPhoneBill));

    }

    public double calculateTax(double subTotal){

        return taxOnSubTotal * subTotal;
    }

    public double calculateOverageFees(double overageMinutes ){

        return costPerOverageMin * overageMinutes;
    }
    public double calculateFinalTotal(double baseCost, double overageFeesCalculated, double taxCalculated){
        return  baseCost + overageFeesCalculated + taxCalculated;

    }
}
