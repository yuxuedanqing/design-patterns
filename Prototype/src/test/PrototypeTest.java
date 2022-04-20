package test;

import clone.Circle;
import clone.ProtoTypeManager;
import clone.Realizetype;
import clone.Shape;

public class PrototypeTest {

    public static void main(String[] args) {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
        new PrototypeTest().testShape();
    }

    public void testShape() {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = pm.getShape("Square");
        obj2.countArea();
    }
}
