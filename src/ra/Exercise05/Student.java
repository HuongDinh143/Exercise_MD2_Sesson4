package ra.Exercise05;

import java.util.Scanner;

public class Student {
    private String  studentId;
    private String  studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phoneNumber;
    public Student(String studentId, String studentName, int age, boolean gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Student(){

    }
    public void inputData(Scanner scanner){
        System.out.println("Điền vào mã sv: ");
        this.studentId = scanner.nextLine();
        System.out.println("Điền vào tên sv: ");
        this.studentName = scanner.nextLine();
        System.out.println("Điền vào tuổi sv: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Điền vào giới tính sv: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Điền vào địa chỉ sv: ");
        this.address = scanner.nextLine();
    }

    public void displayData() {
        System.out.printf("Mã HS: %s - Tên HS: %s - Tuổi: %d - Giới tính: %s - Địa chỉ: %s - SĐT: %s\n",
                this.studentId, this.studentName, this.age, this.gender ? "Nam" : "Nữ", this.address, this.phoneNumber);
    }

    public String getStudentId() {
        return studentId;
    }
    public void updateData(Scanner scanner) {
        System.out.println("Nhập vào tên sv: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sv: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sv: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sv: ");
        this.address = scanner.nextLine();
    }
}
