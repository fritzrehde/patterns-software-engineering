public class Policy {
	Context context;

	public Policy(Context context) {
		this.context = context;
	}

	public void configure() {
		Strategy strategy;
		if (context.useFirstAlgorithm) {
			strategy = new ConcreteStrategy1();
		} else {
			strategy = new ConcreteStrategy2();
		}

		context.selectStrategy(strategy);
	}

}
