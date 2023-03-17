public class ConcreteStateA implements State {
	// switch to state B
	@Override
	public void handle(Context context) {
		System.out.println("switching from state A to state B");
		context.setState(new ConcreteStateB());
	}

	public void print() {
		System.out.println("current state is A");
	}
}
