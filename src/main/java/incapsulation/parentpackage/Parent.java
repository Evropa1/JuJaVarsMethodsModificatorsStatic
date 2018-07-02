package incapsulation.parentpackage;

import java.time.LocalDate;

public class Parent {
    public static void staticMethod(String somethingToSay) {
        System.out.println("Static method in "
                + Parent.class.getName()
                + " says: " + somethingToSay);
    }

    /**
     * aPublicMethod - имя метода
     * (access) public - доступен в любом другом классе
     * (return) void - ничего не возвращает,
     * (parameter) String somethingToSay - принимает параметр строчного типа
     *
     */
    public void aPublicMethod(String somethingToSay) {
        //тело
        System.out.println("A method in "
                + this.getClass().getName()
                + " says: I'm a consumer, I take, not give: " + somethingToSay);
        //тут мог быть ваш возвращаемый тип, но он пуст, потому что void
    }

    /**
     * aProtectedMethod - имя метода
     * (access) protected - доступен в пакете и каждому наследнику
     * return int - возвращает целочисленное значение 1, которое объявили вначале,
     * (parameter) double somethingToSay - принимает параметр строчного типа
     */
    protected int aProtectedMethod(double somethingToSay) {
        //тело
        int integer = 1;
        System.out.println("A method in "
                + this.getClass().getName()
                + " says: " + integer
                + ". " + somethingToSay);
        //возвращаемый тип
        return integer;
    }

    /**
     * aPackagePrivadeDefaultMethod - имя метода
     * (access) absent - default - доступен только в пакете
     * (return) LocalDate - возвращает дату, которую ввели как параметр вначале,
     * (parameter) LocalDate somethingToSay - принимает параметр строчного типа
     */
    LocalDate aPackagePrivadeDefaultMethod(LocalDate somethingToSay) {
        //тело
        int integer = 1;
        System.out.println("A method in "
                + this.getClass().getName()
                + " says: " + integer
                + ". " + somethingToSay);
        //возвращаемый тип
        return somethingToSay;
    }

    /**
     * aPackagePrivadeDefaultMethod - имя метода
     * (access) absent - default - доступен только в пакете
     * (return) LocalDate - возвращает дату, которую ввели как параметр вначале,
     * (parameter) LocalDate somethingToSay - принимает параметр строчного типа
     */
    private LocalDate aPrivateMethod() {
        //тело
        System.out.println("A method in "
                + this.getClass().getName()
                + " says: I produce current date, I'm a producer.");
        //возвращаемый тип
        return LocalDate.now();
    }

    private void letsTryToUseOtherMethodsFromInstance(){
        Parent parent = new Parent();
        parent.aPublicMethod("I do important things.");
        int i = parent.aProtectedMethod(1.0);
        LocalDate myLocalDate = parent.aPackagePrivadeDefaultMethod(LocalDate.now());
        LocalDate myPrivateLocalDate = parent.aPrivateMethod();
    }
}
