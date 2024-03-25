package task3;

public class Parent {
    int m;

    void setM(int m) {
        this.m = m;
    }

    void displayM() {
        System.out.println("This is from parent : m = " + m);
    }
}

class Child extends Parent {
    int n;

    void setN(int n) {
        this.n = n;
    }

    void displayN() {
        System.out.println("This is from child : n = " + n);
    }
}

class ChildDemo {
    public static void main(String arg[]) {
        Child c = new Child();
        c.setM(10);
        c.setN(20);
        c.displayM();
        c.displayN();
    }
}
