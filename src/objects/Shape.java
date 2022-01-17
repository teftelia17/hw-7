package objects;

public abstract class Shape implements Positionable, Framable, Mirrorable, Scalable {
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
    public void swap() {
        Mirrorable.super.swap();
    }

    @Override
    public void zoomIn() {
        Scalable.super.zoomIn();
    }

    @Override
    public void zoomOut() {
        Scalable.super.zoomOut();
    }
}
