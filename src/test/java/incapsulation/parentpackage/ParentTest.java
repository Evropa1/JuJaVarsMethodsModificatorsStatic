package incapsulation.parentpackage;

import encapsulation.parentpackage.Parent;
import org.junit.Test;

import java.time.LocalDate;

public class ParentTest {
    Parent parent = new Parent();

    @Test
    public void aPublicMethodTest() {
        parent.aPublicMethod("I speak");
    }

    /*@org.junit.Test
    public void aProtectedMethodTest() {
        parent.aProtectedMethod(3.0);
    }*/

    @Test
    public void test() throws Exception {
        parent.testAll(LocalDate.now());
    }
}