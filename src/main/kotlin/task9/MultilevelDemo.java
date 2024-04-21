package task9;

import java.io.DataInputStream;

class Student {
    private int rollNo;
    private String name;
    DataInputStream dis = new DataInputStream(System.in);

    public void getRollNo() {
        try {
            System.out.println("Enter rollNo: ");
            rollNo = Integer.parseInt(dis.readLine());
            System.out.println("Enter name ");
            name = dis.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void putRollNo() {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
    }
}

class Marks extends Student {
    protected int m1, m2, m3;

    void getMarks() {

        try {
            System.out.println("Enter marks: ");
            m1 = Integer.parseInt(dis.readLine());
            m2 = Integer.parseInt(dis.readLine());
            m3 = Integer.parseInt(dis.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void putMarks() {
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
    }


}

class Result extends Marks {
    private float total;

    void computeDisplay() {
        total = m1 + m2 + m3;
        System.out.println("Total marks: " + total);
    }
}

class MultilevelDemo {
    public static void main(String[] args) {
        Result r = new Result();
        r.getRollNo();
        r.getMarks();
        r.putRollNo();
        r.putMarks();
        r.computeDisplay();
    }
}
