package encapsulation.parentpackage;

import java.time.LocalDate;


 public class Parent {
    public static final String a = "a";
    public static Integer integer;
    protected String b = "b";
    String c = "c";
    private String d = "d";


    static {
        integer = 1;
    }

    /**
     * требует абстрактоного класса или интерфейса. Методы интерфейса абстрактные по умолчанию.
     */
    //public abstract void anAbstractMethod() ;
    public synchronized void aSynchronizedMethod() {
    }

    public final void aFinalMethod() {

        System.out.println("A final method from " + this.getClass().getName() + d + a);
    }

    // принимает только статические переменные
    public static void staticMethod(final String somethingToSay) {
        System.out.println("Static method in "
                + Parent.class.getName()
                + " says: " + somethingToSay + a);
    }

    /**
     * aPublicMethod - имя метода
     * (access) public - доступен в любом другом классе
     * (return) void - ничего не возвращает, метод-потребитель, consumer
     * (parameter) String somethingToSay - принимает параметр строчного типа
     */
    public void aPublicMethod(String somethingToSay) {
        //тело
        System.out.println("A method in "
                + this.getClass().getName()
                + " says: I'm a consumer, I take, not give: " + somethingToSay);
        //тут мог быть ваш возвращаемый тип, но он пуст, потому что void
    }

    /**
     * aPrivateMethod - имя метода
     * (access) private - доступен только в текущем классе
     * (return) LocalDate - возвращает дату, которую ввели как параметр вначале,
     * (parameter) нету - метод-производитель, producer
     */
    private LocalDate aPrivateMethod() {
        //тело
        System.out.println("A method in "
                + this.getClass().getName()
                + " says: I produce current date, I'm a producer.");
        //возвращаемый тип
        return LocalDate.now();
    }

    /**
     * aProtectedMethod - имя метода
     * (access) protected - доступен в пакете и каждому наследнику
     * return int - возвращает целочисленное значение 1, которое объявили вначале,
     * (parameter) double somethingToSay - принимает параметр строчного типа
     * (parameter) long... longs - массив из любого количества элементов типа long, начиная с нуля
     */
    protected int aProtectedMethod(double somethingToSay, long... longs) {
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
     * aPackagePrivateDefaultMethod - имя метода
     * (access) absent - default - доступен только в пакете
     * (return) LocalDate - возвращает дату, которую ввели как параметр вначале,
     * (parameter) LocalDate somethingToSay - принимает параметр строчного типа
     * (throws) IllegalArgumentException - в процессе выполнения метода может случится исключение
     */
    LocalDate aPackagePrivateDefaultMethod(final LocalDate somethingToSay) throws Exception {
        //тело
        final int integer = 1;

        System.out.println("A method in "
                + this.getClass().getName()
                + " says: " + integer
                + ". " + somethingToSay);

        String outside;

        if (somethingToSay.isAfter(LocalDate.now())) {
            outside = "Hi";
            return LocalDate.now();
            //throw new IllegalArgumentException("Wrong date");
        } else if (somethingToSay.isEqual(LocalDate.now())) {
            outside = "No";
            throw new Exception("You've won the lotery!");
        } else outside = "Nothing";

        System.out.println(outside);

        //возвращаемый тип
        return somethingToSay;
    }

    private void letsTryToUseOtherMethodsFromInstance() throws Exception {
        Parent parent = new Parent();
        parent.aPublicMethod("I do important things.");
        int i = parent.aProtectedMethod(1.0);
        LocalDate myLocalDate = parent.aPackagePrivateDefaultMethod(LocalDate.now());
        LocalDate myPrivateLocalDate = parent.aPrivateMethod();
    }

    public LocalDate testAll(final LocalDate somethingToSay) throws Exception {
        //тело
        final int integer = 1;

        System.out.println("A method in "
                + this.getClass().getName()
                + " says: " + integer
                + ". " + somethingToSay);

        String outside;

        if (somethingToSay.isAfter(LocalDate.now())) {
            outside = "Hi";
            System.out.println("OUTSIDE VAR:" + outside);
            return LocalDate.now();
            //throw new IllegalArgumentException("Wrong date");
        } else if (somethingToSay.isEqual(LocalDate.now())) {
            outside = "No";
            System.out.println("OUTSIDE VAR:" + outside);
            throw new Exception("You've won the lotery!");
        } else outside = "Nothing";

        System.out.println("OUTSIDE VAR:" + outside);

        //возвращаемый тип
        return somethingToSay;
    }

    private class MyInnerClass{
        String myvar;

        public MyInnerClass(String myvar) {
            this.myvar = myvar;
        }
    }

}
