package basic;

import modeltest.Calulation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaculationTest {

    @Test
    public void testSum() {
        Calulation calulation = new Calulation();
        Long a = 10L;
        Long b = 5L;

        Long c = calulation.sum(a, b);

        Assertions.assertEquals(15L, c);
    }
}
