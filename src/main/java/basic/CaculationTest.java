package basic;

import modeltest.Calulation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaculationTest {

    @Test
    public void testSum() {
        Calulation calulation = new Calulation();
        Long a = 10L;
        Long b = 5L;

        Long c = calulation.sum(a, b);

        assertEquals(15, c);
    }
}
