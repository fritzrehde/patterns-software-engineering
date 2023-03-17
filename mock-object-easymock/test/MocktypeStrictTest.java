import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.MockType;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


// DOCUMENTATION: https://easymock.org/user-guide

@ExtendWith(EasyMockExtension.class)
class MocktypeStrictTest {

    // 1. Create mock object

    // Checks the order of method calls
    @Mock(type = MockType.STRICT)
    private NumberGenerator mockStrict;
    // private NumberGenerator mockStrict = strictMock(NumberGenerator.class);

    // 2. Create test subject
    @TestSubject
    private SUT testSubject = new SUT(mockStrict);


    @Test
    void testStrictMocktype() {
        // 3. Specify expected behaviour
        int first = 24;
        int second = 42;
        // STRICT type: mocked methods must be called (in testSubject/SUT) in same order as expected declaration
        // expect(mockStrict.generateSecond()).andReturn(second);
        // expect(mockStrict.generateFirst()).andReturn(first);
        expect(mockStrict.generateFirst()).andReturn(first);
        expect(mockStrict.generateSecond()).andReturn(second);

        // 4. Make mock object ready to play
        replay(mockStrict);

        // 5. Execute the SUT
        testSubject.save();
        // STRICT type does not allow call to non-mocked method doMagic() (use NICE instead)
        // mockDefault.doMagic();

        // 6. Compare actual with expected behaviour
        int expected = first + second;
        int actual = testSubject.access();
        assertEquals(expected, actual);

        // 7. Verify that the mock has actually been called
        verify(mockStrict);
    }
}
