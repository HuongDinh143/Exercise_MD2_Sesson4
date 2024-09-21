package ra.Exercise01;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5,"Pink");
        circle1.displayData();
        Circle circle2 = new Circle();
        System.out.println("Chu vi hinh tron: "+circle1.chuVi());
        System.out.println("Dien tich hinh tron: "+circle1.dienTich());
        Scanner scanner = new Scanner(System.in);
        circle2.inputData(scanner);
        circle2.displayData();
    }
}
