package task8;

import java.lang.*;

interface Area {
    final static float pi = 3.14F;

    double compute(double x, double y);
}

interface Display extends Area {
    void displayResult(double result);
}

class Rectangle implements Display {
    public double compute(double x, double y) {
        return (pi * x * y);
    }

    public void displayResult(double result) {
        System.out.println("The Area is: " + result);
    }
}

class InterfaceExtendsDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        double result = rect.compute(10.2, 12.3);
        rect.displayResult(result);
    }
}

