import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


// DOCUMENTATION: https://easymock.org/user-guide

@ExtendWith(EasyMockExtension.class)
class MocktypeDefaultTest {

    // 1. Create mock object

    // Throws an AssertionError for unexpected method calls
    // Does not check the order of method calls
    @Mock
    private NumberGenerator mockDefault;
    // private NumberGenerator mockDefault = mock(NumberGenerator.class);

    // 2. Create test subject
    @TestSubject
    private SUT testSubject = new SUT(mockDefault);


    @Test
    void testDefaultMocktype() {
        // 3. Specify expected behaviour
        int first = 24;
        int second = 42;
        // DEFAULT type: mocked methods can be called in any order (use STRICT to force order)
        expect(mockDefault.generateSecond()).andReturn(second);
        expect(mockDefault.generateFirst()).andReturn(first);

        // 4. Make mock object ready to play
        replay(mockDefault);

        // 5. Execute the SUT
        testSubject.save();
        // DEFAULT type does not allow call to non-mocked method doMagic() (use NICE instead)
        // mockDefault.doMagic();

        // 6. Compare actual with expected behaviour
        int expected = first + second;
        int actual = testSubject.access();
        assertEquals(expected, actual);

        // 7. Verify that the mock has actually been called
        verify(mockDefault);
    }
}
