package chapter5;

import java.util.Scanner;
/**
 * A program that calculates the final total of someone's cell phone bill based on the base plan cost,
 * overage minutes, and applicable taxes.
 * <p>
 * The program performs the following steps:
 * - Takes user input for the base plan cost and overage minutes.
 * - Calculates overage fees.
 * - Calculates tax based on the subtotal.
 * - Calculates the final total phone bill.
 * - Prints a detailed phone bill statement.
 */
public class PhoneBillCalculator {

    /**
     * Cost per overage minute.
     */
    static double costPerOverageMin = 0.25;
    /**
     * Tax rate applied to the subtotal.
     */
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
    /**
     * Calculates the tax amount based on the subtotal.
     *
     * @param subTotal The subtotal amount (sum of base cost and overage fees).
     * @return The calculated tax based on the subtotal.
     */
    public double calculateTax(double subTotal){

        return taxOnSubTotal * subTotal;
    }
    /**
     * Calculates the overage fees based on the number of overage minutes.
     *
     * @param overageMinutes The number of minutes exceeding the plan limit.
     * @return The calculated overage fee.
     */

    public double calculateOverageFees(double overageMinutes ){

        return costPerOverageMin * overageMinutes;
    }

    /**
     * Calculates the final total phone bill.
     *
     * @param baseCost The base cost of the phone plan.
     * @param overageFeesCalculated The total overage fees calculated.
     * @param taxCalculated The tax amount calculated on the subtotal.
     * @return The final total amount of the phone bill.
     */
    public double calculateFinalTotal(double baseCost, double overageFeesCalculated, double taxCalculated){
        return  baseCost + overageFeesCalculated + taxCalculated;

    }
}
