package ra.Exercise03;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void setA(double a) {this.a=a;}

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Enter a :");
        this.a = scanner.nextDouble();
        System.out.print("Enter b :");
        this.b = scanner.nextDouble();
        System.out.print("Enter c :");
        this.c = scanner.nextDouble();
    }
    public double getDiscriminant() {
        return this.b* this.b - 4* this.a* this.c;
    }

    public double getRoot1(){
        if(getDiscriminant()>=0){
            double root1=(-this.b+Math.pow((this.b*this.b-4*this.a*this.c),0.5))/(2*a);
                    return root1;
        }else {
            return 0;
        }
    }
    public double getRoot2(){
        if(getDiscriminant()>=0){
            double root2=(-this.b-Math.pow((this.b*this.b-4*this.a*this.c),0.5))/(2*a);
            return root2;
        }else {
            return 0;
        }
    }

    public void display() {
        if (this.a == 0&&this.b == 0&&this.c == 0) {
            System.out.println("Phương trình vô số nghiệm");
        }else if(getDiscriminant()==0){
            System.out.println("Phương trình có nghiệm kép");
            System.out.println("root1 =root2 = "+getRoot1());
        } else if (getDiscriminant()>0) {
            System.out.println("Phương trình có 2 nghiệm là: ");
            System.out.println("root1 = "+getRoot1());
            System.out.println("root2 = "+getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
