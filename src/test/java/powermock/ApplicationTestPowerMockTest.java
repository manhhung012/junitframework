package powermock;

import modeltest.Application;
import modeltest.Calulation;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.when;


@RunWith(PowerMockRunner.class)
@PrepareForTest({Calulation.class})
public class ApplicationTestPowerMockTest {

    @Before
    public void init() {
        PowerMockito.mockStatic(Calulation.class);
    }

    @Test
    public void checkAveragePowerMockStatic() {
        PowerMockito.mockStatic(Calulation.class);

        when(Calulation.average(10.0, 8.0)).thenReturn(9.0);

        Application application = new Application();

        Assertions.assertTrue(application.checkAverage(10.0, 8.0));
    }


}