// ElectricityBill.java

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Electricity Bill Generator ======");
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        String customerId = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill = calculateBill(units);

        System.out.println("\n========= Bill Details =========");
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + name);
        System.out.println("Units Used    : " + units);
        System.out.printf("Total Bill    : ₹%.2f%n", bill);
        System.out.println("================================");
    }

    public static double calculateBill(int units) {
        double amount = 0;

        if (units <= 100) {
            amount = units * 1.5;
        } else if (units <= 300) {
            amount = 100 * 1.5 + (units - 100) * 2.5;
        } else {
            amount = 100 * 1.5 + 200 * 2.5 + (units - 300) * 4.0;
        }

        double tax = amount * 0.18; // 18% GST
        return amount + tax;
    }
}
