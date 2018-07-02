package incapsulation.parentpackage.insidepackage;

import incapsulation.parentpackage.Parent;

public class InsideClass {
    private void letsTryToUseOtherMethodsAsTheyAre() {
        //aPublicMethod("I do important things.");
        //aProtectedMethod(1.0);
        //aPackagePrivadeDefaultMethod(LocalDate.now());
        //aPrivateMethod();
    }

    private void letsTryToUseOtherMethodsFromInstance() {
        Parent parent = new Parent();
        parent.aPublicMethod("I do important things.");
        //int i = parent.aProtectedMethod(1.0);
        //LocalDate myLocalDate = parent.aPackagePrivadeDefaultMethod(LocalDate.now());
        //LocalDate myPrivateLocalDate = parent.aPrivateMethod();
    }


}
