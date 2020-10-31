package lazy;

public class LazyTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Client());
        Thread t2 = new Thread(new Client());
        t1.start();
        t2.start();
        System.out.println("Exctor end");
    }
}
