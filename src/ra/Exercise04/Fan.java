package ra.Exercise04;

import java.util.Objects;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan() {

    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (this.on) {
            return "Fan{" +
                    "speed=" + this.speed +
                    ", color=" + color +
                    ", radius=" + radius +
                    ", fan is on" + '}';
        } else {
            return "Fan{" +
                    "speed=" + this.speed +
                    ", color=" + color +
                    ", radius=" + radius +
                    ", fan is off" + '}';
        }
    }


}
