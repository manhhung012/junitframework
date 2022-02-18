package basic;

import modeltest.Application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
    @Test
    public void checkTest() {
        Application application = new Application();

        Long a = 10L;
        Long b = 5L;

        boolean check = application.check(a, b);

        Assertions.assertEquals(true, check);

    }
}
