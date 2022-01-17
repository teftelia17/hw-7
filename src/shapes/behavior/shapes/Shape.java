package shapes.behavior.shapes;

import shapes.behavior.behavior.Framable;
import shapes.behavior.behavior.Mirrorable;
import shapes.behavior.behavior.Positionable;
import shapes.behavior.behavior.Scalable;

public abstract class Shape implements Positionable, Framable, Mirrorable, Scalable {
    private int originScale = 0;


    public String getName() {
        return "Shape";
    }

    @Override
    public void setY() {
        Positionable.super.setY();
    }

    @Override
    public void setX() {
        Positionable.super.setX();
    }

    @Override
    public void setThicknessFrame() {
        Framable.super.setThicknessFrame();
    }

    @Override
    public void horizontalSwap() {
        System.out.println("The "+getName()+" has been swapped horizontally");
    }

    @Override
    public void verticalSwap() {
        System.out.println("The "+getName()+" has been swapped vertically");
    }

    @Override
    public int zoomIn(int zoomPlus) {
        System.out.println("The " + getName() + " has been zoomed In to");
        return originScale + zoomPlus;
    }


    @Override
    public int zoomOut(int zoomMinus) {
        System.out.println("The " + getName() + " has been zoomed Out to");
        return originScale - zoomMinus ;
    }
}