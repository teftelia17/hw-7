package objects;

public interface Positionable {
    default void setX() {
        System.out.println("x is ...");
    }
    default void setY(){
        System.out.println("y is ...");
    }
}
