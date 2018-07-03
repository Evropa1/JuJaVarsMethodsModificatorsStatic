package different;

import org.junit.Test;

import java.math.BigDecimal;

public class AllTestsToTry {
    @Test
    public void bigDec(){
        new BigDecimal("1.0");
        new BigDecimal(1.0);
        new BigDecimal(1);
    }

    public double add(double i, double j){
        return i + j;
    }
    public double add(double i){
        return i + 1;
    }
   /* public int add(double i){
        return i + 1;
    }*/


}
