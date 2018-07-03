package encapsulation.parentpackage;

import java.time.LocalDate;

class _ChildDirect extends Parent {
    private void letsTryToUseOtherMethodsAsTheyAre() throws Exception {
        System.out.println(Parent.a);
        this.aPublicMethod("I do important things.");
        this.aProtectedMethod(1.0);
        this.aPackagePrivateDefaultMethod(LocalDate.now());
        //this.aPrivateMethod();
    }

    private void letsTryToUseOtherMethodsFromInstance() throws Exception {
        Parent parent = new Parent();
        System.out.println(parent.b);
        System.out.println(parent.c);
        parent.aPublicMethod("I do important things.");
        int i = parent.aProtectedMethod(1.0);
        LocalDate myLocalDate = parent.aPackagePrivateDefaultMethod(LocalDate.now());
        //LocalDate myPrivateLocalDate = parent.aPrivateMethod();
    }

    // расширили доступ дефолтному методу -) public
    @Override
    public LocalDate aPackagePrivateDefaultMethod(LocalDate somethingToSay) throws Exception {
        System.out.println("This is overridden method");
        return super.aPackagePrivateDefaultMethod(somethingToSay);
    }

    @Override
    public String toString() {
        return "a child of a parent speaks";
    }
}

