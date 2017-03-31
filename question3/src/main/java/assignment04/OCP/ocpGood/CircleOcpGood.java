package assignment04.OCP.ocpGood;

/**
 * Created by aubrey on 31/03/2017.
 */
public class CircleOcpGood extends Shape {

    private double radius;

    public CircleOcpGood(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
