package incapsulation.parentpackage;

import encapsulation.parentpackage.Parent;
import org.junit.Test;

public class ParentTest {
    Parent parent = new Parent();

    @Test
    public void aPublicMethodTest() {
        parent.aPublicMethod("I speak");
    }

    @org.junit.Test
    public void aProtectedMethodTest() {
        parent.aProtectedMethod(3.0);
    }
}