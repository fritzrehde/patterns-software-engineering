import org.easymock.EasyMock;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	@Bean
	public SUT sut() {
		return new SUT();
	}

	@Bean
	public NumberGenerator numberGenerator() {
		return EasyMock.mock(NumberGenerator.class);
	}
}
