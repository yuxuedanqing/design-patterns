package clone;

public class Realizetype implements Cloneable{


    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Realizetype clone() {
        try {
            System.out.println("具体原型复制成功！");
            return (Realizetype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
