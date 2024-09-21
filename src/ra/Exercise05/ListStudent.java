package ra.Exercise05;

import java.util.ArrayList;
import java.util.Scanner;

public class ListStudent {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n----- MENU CHỨC NĂNG -----");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xóa học sinh dựa vào mã học sinh");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline character after nextInt()

            switch (choice) {
                case 1:
                    displayStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
            }
        } while (choice != 5);
    }

    // Hiển thị tất cả sinh viên
    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Không có sinh viên trong danh sách.");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (Student element : students) {
                element.displayData();
            }
        }
    }

    // Thêm sinh viên mới
    private static void addStudent() {
        Student newStudent = new Student();
        newStudent.inputData(scanner);
        students.add(newStudent);
        System.out.println("Thêm sinh viên thành công.");
    }

    // Sửa thông tin sinh viên
    private static void editStudent() {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        String studentID = scanner.nextLine();
        boolean found = false;

        for (Student element : students) {
            if (element.getStudentId().equals(studentID)) {
                element.updateData(scanner);
                System.out.println("Thông tin sinh viên đã được cập nhật.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy mã sinh viên: " + studentID);
        }
    }

    // Xóa sinh viên
    private static void deleteStudent() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String studentID = scanner.nextLine();
        boolean found = false;

        for (Student element : students) {
            if (element.getStudentId().equals(studentID)) {
                students.remove(element);
                System.out.println("Xóa sinh viên thành công.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy mã sinh viên: " + studentID);
        }
    }
}