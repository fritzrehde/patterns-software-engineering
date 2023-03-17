import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public NumberGenerator numberGenerator() {
		return new RandomNumberGenerator();
	}
}
