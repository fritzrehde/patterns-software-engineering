public class ConcreteObserver<T> extends Observer<T> {
	public ConcreteObserver() {
	}

	@Override
	public void update() {
		observedState = subject.getState();

		System.out.println("ConcreteObserver updated: " + observedState.toString());
	}
}
