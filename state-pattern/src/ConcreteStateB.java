public class ConcreteStateB implements State {
	@Override
	public void handle(Context context) {
		System.out.println("switching from state B to state A");
		context.setState(new ConcreteStateA());
	}

	public void print() {
		System.out.println("current state is B");
	}
}
