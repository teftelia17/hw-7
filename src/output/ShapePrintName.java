package output;

import objects.Ellipse;
import objects.Quad;
import objects.Rectangle;
import objects.Shape;

public class ShapePrintName {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getName());

        Shape ellipse = new Ellipse();
        System.out.println(ellipse.getName());
        ellipse.swap();
        ellipse.setThicknessFrame();

        Shape quad = new Quad();
        System.out.println(quad.getName());
        quad.setThicknessFrame();

    }
}
