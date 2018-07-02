package incapsulation.parentpackage;

import org.junit.Test;

import java.time.LocalDate;

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

    @org.junit.Test
    public void aPackagePrivadeDefaultMethodTest() {
        parent.aPackagePrivadeDefaultMethod(LocalDate.now());
    }
}