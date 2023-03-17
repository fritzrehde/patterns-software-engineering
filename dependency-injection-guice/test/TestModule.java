import com.google.inject.AbstractModule;
import org.easymock.EasyMock;

public class TestModule extends AbstractModule {
	@Override
	protected void configure() {
		NumberGenerator numberGenerator = EasyMock.mock(NumberGenerator.class);

		bind(NumberGenerator.class).toInstance(numberGenerator);
	}
}
