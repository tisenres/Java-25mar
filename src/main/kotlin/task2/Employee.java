package task2;
import java.lang.*;

public class Employee {
    String name;
    int id;
    String address;

    public void setData(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public void displayData() {
        System.out.println("Employee details are: ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
    }
}



