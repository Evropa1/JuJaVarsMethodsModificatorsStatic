package different;

public class OverrideTest {

    private String newField = "new";
    private static String newField2 = "newStatic";

     {
         newField = "inBlock";
        newField2 = "newStaticInBlock";
    }

    public OverrideTest(String newField) {
       // newField2 = "staticInConstructor";
        this.newField = newField;
    }

    public static void main(String[] args) {
        OverrideTest t = new OverrideTest("one more new ");
        System.out.println(t.toString());
        System.out.println(newField2);

    }

    @Override
    public String toString() {
        return "OverrideTest{" +
                "newField='" + newField + '\'' +
                "newField2='" + newField2 + '\'' +
                '}';
    }


}
