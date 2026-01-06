package client;

import common.Calculator;
import java.rmi.Naming;
import java.util.Scanner;

public class RMIClient {

    public static void main(String[] args) {
        try {
            // ❌ REMOVED SecurityManager (deprecated in Java 17)

            Calculator calc = (Calculator)
                    Naming.lookup("rmi://localhost:1099/CalculatorService");

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n1. Add  2. Subtract  3. Multiply  4. Divide");
                System.out.println("5. Modulus  6. Power  7. Square Root  0. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                double a, b;

                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.add(a, b));
                        break;

                    case 2:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.subtract(a, b));
                        break;

                    case 3:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.multiply(a, b));
                        break;

                    case 4:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.divide(a, b));
                        break;

                    case 5:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.modulus(a, b));
                        break;

                    case 6:
                        System.out.print("Enter base and exponent: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.power(a, b));
                        break;

                    case 7:
                        System.out.print("Enter number: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.squareRoot(a));
                        break;

                    case 0:
                        System.out.println("Client exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 0);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
