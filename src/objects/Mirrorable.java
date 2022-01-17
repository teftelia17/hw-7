package objects;

public interface Mirrorable {
    default void swap() {
        System.out.println("swap to...");
    }
}
