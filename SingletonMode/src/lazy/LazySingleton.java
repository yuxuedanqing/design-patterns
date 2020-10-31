package lazy;

public class LazySingleton {

    private static LazySingleton lazy = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (lazy == null){
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
