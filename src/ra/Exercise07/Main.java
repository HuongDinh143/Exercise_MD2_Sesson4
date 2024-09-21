package ra.Exercise07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("--CHỨC NĂNG--");
            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Update thông tin sinh viên theo id");
            System.out.println("4. Xóa sinh viên theo id");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    Student newStudent = new Student();
                    newStudent.inputData(scanner);
                    studentList.addStudent(newStudent);
                    System.out.println("Thêm mới sv thành công");
                    break;
                case 2:
                    studentList.displayStudentList();
                    break;
                case 3:
                    System.out.println("Nhập vào mã sinh viên cần sửa: ");
                    String editId = scanner.nextLine();
                    Student updateStudent = new Student();
                    updateStudent.updateData(scanner);
                    updateStudent.setStudentId(editId);
                    studentList.editStudent(editId, updateStudent);
                    break;
                case 4:
                    System.out.println("Nhập vào mã sinh viên cân xóa: ");
                    String deleteId = scanner.nextLine();
                    studentList.deleteStudent(deleteId);
                    System.out.println("Xóa sinh viên thành công");
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Giá trị không hợp lệ mời chọn lại");

            }
        }while (choice !=5);
    }
}
