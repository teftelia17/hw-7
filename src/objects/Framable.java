package objects;

public interface Framable{
    default void setThicknessFrame() {
        System.out.println("thickness is ...");
    }
}
