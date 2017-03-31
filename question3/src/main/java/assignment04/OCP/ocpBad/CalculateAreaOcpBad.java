package assignment04.OCP.ocpBad;

/**
 * Created by aubrey on 31/03/2017.
 */
public class CalculateAreaOcpBad {
    public double area(Object shape)
    {
        double area = 0;
        if(shape.getClass() == RectangleOcpBad.class)
        {
            RectangleOcpBad rectangle = (RectangleOcpBad)shape;
            area = rectangle.getWidth() * rectangle.getHeight();
        }
        else
        {
            CircleOcpBad circle = (CircleOcpBad)shape;
            area = circle.getRadius() * circle.getRadius() * Math.PI;
        }

        return area;
    }
}
