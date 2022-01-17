package output;

import shapes.behavior.shapes.Shape;
import shapes.behavior.shapes.*;

public class ShapePrintName {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getName());
        System.out.println(rectangle.zoomOut(1));
        System.out.println(rectangle.zoomIn(5));

        Shape ellipse = new Ellipse();
        System.out.println(ellipse.getName());
        System.out.println(ellipse.zoomIn(100));
        System.out.println(ellipse.zoomOut(200));

        Shape quad = new Quad();
        System.out.println(quad.getName());
        quad.verticalSwap();
        quad.horizontalSwap();

        Shape circle = new Circle();
        System.out.println(circle.getName());

        Shape polygon = new Polygon();
        System.out.println(polygon.getName());
        polygon.verticalSwap();
        System.out.println(polygon.zoomIn(20));

    }
}
