import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.easymock.MockType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


// DOCUMENTATION: https://easymock.org/user-guide

@ExtendWith(EasyMockExtension.class)
class MocktypeNiceTest {

    // 1. Create mock object

    // Allows all method calls and returns appropriate empty values (0, null, or false)
    @Mock(type = MockType.NICE)
    private NumberGenerator mockNice;
    // private NumberGenerator mockNice = niceMock(NumberGenerator.class);

    // 2. Create test subject
    @TestSubject
    private SUT testSubject = new SUT(mockNice);


    @Test
    void testNiceMocktype() {
        // 3. Specify expected behaviour
        int first = 24;
        int second = 42;
        // NICE type: mocked methods can be called in any order (use STRICT to force order)
        expect(mockNice.generateSecond()).andReturn(second);
        expect(mockNice.generateFirst()).andReturn(first);

        // 4. Make mock object ready to play
        replay(mockNice);

        // 5. Execute the SUT
        testSubject.save();
        // NICE type allows call to non-mocked method doMagic()
        mockNice.doMagic();

        // 6. Compare actual with expected behaviour
        int expected = first + second;
        int actual = testSubject.access();
        assertEquals(expected, actual);

        // 7. Verify that the mock has actually been called
        verify(mockNice);
    }
}
