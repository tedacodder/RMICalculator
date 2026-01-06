package server;

import common.Calculator;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    public CalculatorImpl() throws RemoteException {
        super(); // exports object
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double squareRoot(double a) {
        if (a < 0)
            throw new ArithmeticException("Negative input");
        return Math.sqrt(a);
    }
}
