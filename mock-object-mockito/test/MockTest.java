import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


// DOCUMENTATION: https://site.mockito.org/
// EASYMOCK vs MOCKITO: https://github.com/mockito/mockito/wiki/Mockito-vs-EasyMock

@ExtendWith(MockitoExtension.class)
class MockTest {
    // 1. Create mock object
    // Mock: full mocking; must specify all behaviour
    @Mock
    private NumberGenerator mock;
    // private NumberGenerator mock = mock(NumberGenerator.class);

    // 2. Create test subject
    // automatic instantiation of testSubject using constructor injection, setter injection or field injection
    @InjectMocks
    private SUT testSubject;

    @Captor
    ArgumentCaptor<String> argument;

    @Test
    void testMock() {
        // 3. Specify expected behaviour
        int first = 24;
        int second = 42;

        when(mock.generateFirst(anyString())).thenReturn(first);
        when(mock.generateSecond()).thenReturn(second);
        // doReturn(second).when(mock).generateSecond();

        // 4. No need to make mock object ready to play with replay

        // 5. Execute the SUT
        testSubject.save();
        // MOCKITO: calling non-mocked methods is allowed (just like easymock NICE)
        assertEquals(mock.doMagic(), 0);

        // 6. Compare actual with expected behaviour
        int expected = first + second;
        int actual = testSubject.access();
        assertEquals(expected, actual);

        // 7. Verification

        // 7.1 Order
        // MOCKITO: ignore order
        verify(mock).generateFirst(anyString());
        verify(mock, atLeastOnce()).generateSecond();

        // MOCKITO: verify order
        InOrder verifyOrder = inOrder(mock);
        verifyOrder.verify(mock).generateFirst(anyString());
        verifyOrder.verify(mock).generateSecond();
        // verifyOrder.verifyNoMoreInteractions();

        // 7.2 Argument matchers
        verify(mock).generateFirst(anyString());
        verify(mock).generateFirst("hello world");
        verify(mock).generateFirst(eq("hello world"));

        // 7.3 Argument captors
        verify(mock).generateFirst(argument.capture());
        assertEquals("hello world", argument.getValue());

        // assertThrows
        assertThrows(NullPointerException.class, () -> {
            throw new NullPointerException();
        });
    }
}
