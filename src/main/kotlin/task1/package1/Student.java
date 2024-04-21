package task1.package1;

public class Student {
    int regNum;
    String name;

    public void getData(int r, String s) {
        regNum = r;
        name = s;
    }

    public void putData() {
        System.out.println("regNum = " + regNum);
        System.out.println("name = " + name);
    }
}

