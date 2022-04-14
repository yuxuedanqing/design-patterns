package lazy;

public class LazySingleton {

    private static volatile LazySingleton lazy = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (lazy == null){
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
