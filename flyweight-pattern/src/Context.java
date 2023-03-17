public class Context {
	private final UniqueState uniqueState;
	private final Flyweight flyweight;

	public Context(UniqueState uniqueState, RepeatingState repeatingState) {
		this.uniqueState = uniqueState;
		this.flyweight = FlyweightFactory.getFlyweight(repeatingState);
	}

	public void operation() {
		flyweight.operation(this.uniqueState);
	}
}
