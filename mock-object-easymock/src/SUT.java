public class SUT {
	private NumberGenerator numberGenerator;
	private int number;

	public SUT(NumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}
	public void save() {
		this.number = numberGenerator.generateFirst() + numberGenerator.generateSecond();
	}

	public int access() {
		return this.number;
	}
}
