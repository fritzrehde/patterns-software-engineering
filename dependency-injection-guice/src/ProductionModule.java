import com.google.inject.AbstractModule;

// Make sure to configure the binding for interface implementations as well.
public class ProductionModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(NumberGenerator.class).to(RandomNumberGenerator.class);
	}

}
