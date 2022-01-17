package objects;

public interface Scalable {
    default void zoomIn() {
        System.out.println("zoomIn...%");
    }
    default void zoomOut() {
        System.out.println("zoomOut...%");
    }
}
