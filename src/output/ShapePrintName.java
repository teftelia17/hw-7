package output;

import objects.*;

public class ShapePrintName {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getName());

        Shape ellipse = new Ellipse();
        System.out.println(ellipse.getName());

        Shape quad = new Quad();
        System.out.println(quad.getName());

        Shape circle = new Circle();
        System.out.println(circle.getName());

        Shape polygon = new Polygon();
        System.out.println(polygon.getName());
        polygon.setThicknessFrame();

    }
}
