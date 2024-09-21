package ra.Exercise02;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Scanner scanner = new Scanner(System.in);
        emp1.inputData(scanner);
        emp1.displayDataEmployeee();
    }
}
