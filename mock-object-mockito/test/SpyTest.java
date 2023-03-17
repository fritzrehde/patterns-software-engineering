import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.LinkedList;
import static org.mockito.Mockito.*;


// DOCUMENTATION: https://site.mockito.org/
// EASYMOCK vs MOCKITO: https://github.com/mockito/mockito/wiki/Mockito-vs-EasyMock

@ExtendWith(MockitoExtension.class)
class SpyTest {
    @Spy
    private LinkedList<String> spy;
    // private List<String> spy = spy(new LinkedList<>());

    @Test
    void testSpyException() {
        // MOCKITO when(): real method is called so spy.get(0) throws IndexOutOfBoundsException (the list is empty)
        // when(spy.get(0)).thenReturn("foo");
        doReturn("foo").when(spy).get(0);

        spy.get(0);

        verify(spy).get(0);
    }

    @Mock
    private NumberGenerator mock;

    @Test
    void testMockOverload() {
        // when(mock.generateSecond()).thenThrow(new RuntimeException());

        // MOCKITO when(): the exception-stubbed foo() method is called so RuntimeException is thrown.
        when(mock.generateSecond()).thenReturn(42);

        // MOCKITO: rejects due to unnecessary stubbings detected
        // doReturn(42).when(mock).generateSecond();

        mock.generateSecond();

        verify(mock).generateSecond();
    }
}
