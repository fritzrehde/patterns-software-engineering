import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberGeneratorTest {

	// Guice Injector
	private Injector injector;
	// SUT
	private SUT testSubject;

	@BeforeEach
	void setUp() {
		injector = Guice.createInjector(new TestModule());

		testSubject = injector.getInstance(SUT.class);
	}

	@Test
	void test() {
		NumberGenerator numberGenerator = injector.getInstance(NumberGenerator.class);

		expect(numberGenerator.generate()).andReturn(42);
		replay(numberGenerator);

		testSubject.save();
		assertEquals(42, testSubject.access());

		verify(numberGenerator);
	}

}
