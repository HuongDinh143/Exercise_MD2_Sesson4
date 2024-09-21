package ra.Exercise07;

import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private boolean gender;
    private String className;
    private int studentAge;
    private String address;
    public Student() {

    }

    public Student(String studentId, String studentName, boolean gender, String className, int studentAge, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.className = className;
        this.studentAge = studentAge;
        this.address = address;
    }
    public String getStudentId() {
        return this.studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void inputData(Scanner scanner) {
        System.out.print("Nhập vào mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào giới tính sinh viên: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào tên lớp: ");
        this.className = scanner.nextLine();
        System.out.println("Nhập vào tuổi: ");
        this.studentAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ");
        this.address = scanner.nextLine();
    }
    public void updateData(Scanner scanner) {
        System.out.println("Nhập vào tên sinh viên mới: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào giới tính sinh viên mới: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào tên lớp mới: ");
        this.className = scanner.nextLine();
        System.out.println("Nhập vào tuổi mới: ");
        this.studentAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ mới: ");
        this.address = scanner.nextLine();
    }
    public void displayStudentInfo() {
        System.out.printf("Mã SV: %s, Ten SV: %s, Gioi tinh: %s, Lớp: %s, Tuổi: %d, Địa chỉ: %s\n",
                this.studentId, this.studentName, this.gender ? "Nam" : "Nữ", this.className, this.studentAge, this.address);
    }



}
