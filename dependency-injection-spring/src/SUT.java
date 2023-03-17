import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SUT {
	@Autowired
	private NumberGenerator numberGenerator;
	private int number;

	public SUT() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		this.numberGenerator = context.getBean(NumberGenerator.class);

		this.number = 0;
	}

	public void save() {
		this.number = numberGenerator.generate();
	}

	public int access() {
		return this.number;
	}
}
