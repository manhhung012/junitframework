package mockito;

import modeltest.Application;
import modeltest.Calulation;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTestMockito {

    @Mock
    Calulation calulationMockitoMock;

    private Application application = new Application();

    @Test
    public void checkTestFalse() {
        Mockito.when(calulationMockitoMock.sum(10L, 5L)).thenReturn(5L);
        application.setCalulation(calulationMockitoMock);
        assertTrue(application.check(10L, 5L));

    }

    @Test
    public void checkTestSusses() {
        Mockito.when(calulationMockitoMock.sum(10L, 5L)).thenReturn(11L);
        application.setCalulation(calulationMockitoMock);
        assertTrue(application.check(10L, 5L));
    }

}
