package ra.Exercise06;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {

    }
    public Circle(double radius, String color) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
