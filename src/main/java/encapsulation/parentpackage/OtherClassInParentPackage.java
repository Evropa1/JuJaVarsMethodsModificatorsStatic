package encapsulation.parentpackage;

import java.time.LocalDate;

public class OtherClassInParentPackage {
    private void letsTryToUseOtherMethodsAsTheyAre() {
        //нету наследника, все недоступны

        //aPublicMethod("I do important things.");
        //aProtectedMethod(1.0);
        //aPackagePrivateDefaultMethod(LocalDate.now());
        //aPrivateMethod();
    }

    private void letsTryToUseOtherMethodsFromInstance() throws Exception {
        Parent parent = new Parent();
        parent.aPublicMethod("I do important things.");
        int i = parent.aProtectedMethod(1.0);
        LocalDate myLocalDate = parent.aPackagePrivateDefaultMethod(LocalDate.now());
        //LocalDate myPrivateLocalDate = parent.aPrivateMethod();
    }
}