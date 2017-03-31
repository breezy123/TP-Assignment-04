package assignment04.OCP.ocpGood;

/**
 * Created by aubrey on 31/03/2017.
 */
public class RectangleOcpGood extends Shape{

    private double width;
    private double height;

    public RectangleOcpGood(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
