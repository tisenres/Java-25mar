package task7;

import java.lang.*;

interface Area {
    final static float pi = 3.14F;
    float compute(float x, float y);
}

class Rectangle implements Area {
    public float compute(float x, float y) {
        return (pi * x * y);
    }
}

class Circle implements Area {
    public float compute(float x, float y) {
        return (pi * x * x);
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area a = rect;
        System.out.println("Area of rectangle = " + a.compute(10, 20));
        a = cir;
        System.out.println("Area of circle = " + a.compute(30, 0));
    }
}



