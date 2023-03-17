public class Flyweight {
	private final RepeatingState repeatingState;

	public Flyweight(RepeatingState repeatingState) {
		this.repeatingState = repeatingState;
	}

	public void operation(UniqueState uniqueState) {
		System.out.println(this.repeatingState.display() + " " + uniqueState.display());
	}
}
