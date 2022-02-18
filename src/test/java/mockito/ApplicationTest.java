package mockito;

import modeltest.Application;
import modeltest.Calulation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

    @Mock
    Calulation calulationMockitoMock;

    @Spy
    Calulation calulationMockitoSpy;

    @Spy
    List<String> listSpy = new ArrayList<>();

    private Application application = new Application();

    @Test
    public void checkTestFalse() {
        Mockito.when(calulationMockitoMock.sum(10L, 5L)).thenReturn(11L);
        application.setCalulation(calulationMockitoMock);

        assertTrue(application.check(10L, 5L));
    }

    @Test
    public void checkTestSusses() {
        Mockito.when(calulationMockitoMock.sum(10L, 5L)).thenReturn(12L);
        application.setCalulation(calulationMockitoMock);

        assertTrue(application.check(10L, 5L));
    }

    @Test
    public void checkTesSpy() {
        Long sumSpy = calulationMockitoSpy.sum(10L, 5L);

        System.out.println(sumSpy);

        Mockito.when(calulationMockitoSpy.sum(10L, 5L)).thenReturn(15L);

        application.setCalulation(calulationMockitoSpy);

        assertTrue(application.check(10L, 5L));
    }

    @Test
    public void checkListSpy() {
        listSpy.add("Str 1");
        listSpy.add("Str 2");


        Mockito.verify(listSpy).add("Str 1");
        Mockito.verify(listSpy).add("Str 2");

        System.out.println(listSpy.size());

        assertEquals(2, listSpy.size());

        Mockito.when(listSpy.size()).thenReturn(100);

        assertEquals(100, listSpy.size());
    }

}
