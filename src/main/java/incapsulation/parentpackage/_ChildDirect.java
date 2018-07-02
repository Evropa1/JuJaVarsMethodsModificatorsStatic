package incapsulation.parentpackage;

import java.time.LocalDate;

public class _ChildDirect extends Parent {

    private void letsTryToUseOtherMethodsAsTheyAre() {
        this.aPublicMethod("I do important things.");
        this.aProtectedMethod(1.0);
        this.aPackagePrivadeDefaultMethod(LocalDate.now());
        //this.aPrivateMethod();
    }

    private void letsTryToUseOtherMethodsFromInstance() {
        Parent parent = new Parent();
        parent.aPublicMethod("I do important things.");
        int i = parent.aProtectedMethod(1.0);
        LocalDate myLocalDate = parent.aPackagePrivadeDefaultMethod(LocalDate.now());
        //LocalDate myPrivateLocalDate = parent.aPrivateMethod();
    }
}
