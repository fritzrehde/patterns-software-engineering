import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberGeneratorTest {

	private static ApplicationContext context;

	// SUT
	private static SUT testSubject;

	@BeforeEach
	void setUp() {
		// Initializes the context using TestConfig as the base configuration
		context = new AnnotationConfigApplicationContext(TestConfig.class);

		// Gets an instance from the injector
		testSubject = context.getBean(SUT.class);
	}

	@Test
	void test() {
		NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

		expect(numberGenerator.generate()).andReturn(42);
		replay(numberGenerator);

		testSubject.save();
		assertEquals(42, testSubject.access());

		verify(numberGenerator);
	}

}
