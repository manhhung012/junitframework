package basic;

import modeltest.Application;
import modeltest.Calulation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Test
    public void checkTest() {
        Application application = new Application();

        Long a = 10L;
        Long b = 5L;

        application.setCalulation(new Calulation());

        boolean check = application.check(a, b);

        assertEquals(true, check);

    }
}
