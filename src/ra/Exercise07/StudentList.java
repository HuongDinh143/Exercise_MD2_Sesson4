package ra.Exercise07;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    private ArrayList<Student> students;
    public StudentList(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    // In ra danh sách
    public void displayStudentList(){
        if(students.isEmpty()){
            System.out.println("Danh sách sinh viên trống");
        }else {
            for (Student student : students) {
                student.displayStudentInfo();
            }
        }

    }
    //Thêm mới
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public void editStudent(String studentId, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentId)) {
                students.set(i, updatedStudent);
                System.out.println("Cập nhật thông tin sinh viên thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã: " + studentId);
    }
    //Xóa
    public void deleteStudent(String studentId) {
        boolean found = false; // Biến cờ để kiểm tra xem sinh viên có tồn tại không
        for (int i = 0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            // Kiểm tra nếu studentId của student không phải null và so sánh với studentId đầu vào
            if (student.getStudentId() != null && student.getStudentId().equals(studentId)) {
                this.students.remove(i);
                System.out.println("Đã xóa sinh viên với mã " + studentId);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với mã " + studentId);
        }
    }

}
