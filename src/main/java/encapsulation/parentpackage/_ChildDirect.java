package encapsulation.parentpackage;

import java.time.LocalDate;

public class _ChildDirect extends Parent {

    @Override
    LocalDate aPackagePrivateDefaultMethod(LocalDate somethingToSay) throws Exception {
        return super.aPackagePrivateDefaultMethod(somethingToSay);
    }

    private void letsTryToUseOtherMethodsAsTheyAre() throws Exception {
        this.aPublicMethod("I do important things.");
        this.aProtectedMethod(1.0);
        this.aPackagePrivateDefaultMethod(LocalDate.now());
        //this.aPrivateMethod();
    }

    private void letsTryToUseOtherMethodsFromInstance() throws Exception {
        Parent parent = new Parent();
        parent.aPublicMethod("I do important things.");
        int i = parent.aProtectedMethod(1.0);
        LocalDate myLocalDate = parent.aPackagePrivateDefaultMethod(LocalDate.now());
        //LocalDate myPrivateLocalDate = parent.aPrivateMethod();
    }
}

