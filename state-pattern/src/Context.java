public class Context {
	private State state;

	public Context() {
		this.state = new ConcreteStateA();
	}

	public void requestNextState() {
		state.handle(this);
	}

	public void printCurrentState() {
		state.print();
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
