package server;

import common.Calculator;
import java.rmi.Naming;

public class RMIServer {

    public static void main(String[] args) {
        try {
            Calculator calculator = new CalculatorImpl();
            Naming.rebind("rmi://localhost:1099/CalculatorService", calculator);

            System.out.println("RMI Calculator Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
