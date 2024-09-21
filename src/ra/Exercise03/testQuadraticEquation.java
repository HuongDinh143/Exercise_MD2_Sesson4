package ra.Exercise03;

import java.util.Scanner;

public class testQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation eq = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        eq.inputData(scanner);
        eq.display();
    }
}
