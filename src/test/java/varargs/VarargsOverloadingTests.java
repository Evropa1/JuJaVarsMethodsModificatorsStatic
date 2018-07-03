package varargs;

import org.junit.Test;

public class VarargsOverloadingTests {

    public void overloadedMethod(int somethingToSay, int... ints) {
        System.out.println(somethingToSay);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public void overloadedMethod(String somethingToSay, int... ints) {
        overloadedMethod("Hi :)", 12);
    }


   /* public void overloadedMethod(int... ints) {
        overloadedMethod(1, 12);
    }
*/
    /**
     * vararg param должен быть последним
     */
    /*
    public void aProtectedMethod(int... ints, String s) {
    }
    public void aProtectedMethod(String... s, int... ints) {
    }
 */
    @Test
    public void testVarargs3() {
        overloadedMethod(1, 2, 3, 4);
        //2,3,4
    }

    @Test
    public void testVarargs0() {
        overloadedMethod(1);
        //nothing
    }

    @Test
    public void testVarargsArray() {
        int[] integers = {1};
        overloadedMethod(0, integers);
        //1
    }
}