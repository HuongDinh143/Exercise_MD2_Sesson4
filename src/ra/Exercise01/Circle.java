package ra.Exercise01;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
   public double chuVi(){
        return Math.PI * radius * 2;
   }
   public double dienTich(){
        return Math.PI * radius * radius;
   }
   public void inputData(Scanner scanner){
        System.out.print("Nhập vào bán kính hình tròn: ");
        this.radius = scanner.nextFloat();
       System.out.print("Nhập vào màu sắc: ");
       this.color = scanner.next();
   }
   public void displayData(){
       System.out.printf("Bán kính: %.2f, Màu: %s\n", radius, color);
   }

}
