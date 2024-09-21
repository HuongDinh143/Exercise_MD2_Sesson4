package ra.Exercise02;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gender;
    private float rate;
    private double salary;
    public Employee(){

    }
    public Employee(String employeeId, String employeeName, int age, boolean gender, float rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = salary;
    }
    public void  inputData(Scanner scanner){
        System.out.print("Enter employee ID: ");
        this.employeeId = scanner.nextLine();
        System.out.print("Enter employee name: ");
        this.employeeName = scanner.nextLine();
        System.out.print("Enter age: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter gender: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Enter rate: ");
        this.rate = Float.parseFloat(scanner.nextLine());
    }
    public double calSalary(){
        this.salary = this.rate * 1300000;
        return salary;
    }
    public void displayDataEmployeee(){
        System.out.printf("Mã NV: %s - Tên NV: %s - Tuổi: %d\n", this.employeeId, this.employeeName, this.age);
        System.out.printf("Giới tính: %s - Lương: %s\n", this.gender ? "Nam" : "Nữ", this.calSalary());


    }
}
