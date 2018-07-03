package varargs;

import org.junit.Test;

public class VarargsTests {

    public void aProtectedMethod(int somethingToSay, int... ints) {
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    /*public void aProtectedMethod(int... ints) {
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }*/

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
        aProtectedMethod(1, 2, 3, 4);
        //2,3,4
    }

    @Test
    public void testVarargs0() {
        aProtectedMethod(1);
        //nothing
    }

    @Test
    public void testVarargsArray() {
        int[] integers = {1};
        aProtectedMethod(0, integers);
        //1
    }
}