public class Context {
	private Strategy strategy;
	public boolean useFirstAlgorithm;

	public Context(boolean useFirstAlgorithm) {
		this.useFirstAlgorithm = useFirstAlgorithm;
	}

	public void executeAlgorithm() {
		strategy.performAlgorithm();
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void selectStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
