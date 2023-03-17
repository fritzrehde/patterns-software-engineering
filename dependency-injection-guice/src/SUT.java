import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class SUT extends AbstractModule {
	@Inject
	private NumberGenerator numberGenerator;
	private int number;

	public SUT() {
		Injector injector = Guice.createInjector(new ProductionModule());
		this.numberGenerator = injector.getInstance(NumberGenerator.class);

		this.number = 0;
	}

	public void save() {
		this.number = numberGenerator.generate();
	}

	public int access() {
		return this.number;
	}
}
