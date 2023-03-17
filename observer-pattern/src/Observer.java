public abstract class Observer<T> {
	T observedState;
	ConcreteSubject<T> subject;

	abstract void update();

	public void setSubject(ConcreteSubject<T> subject) {
		this.subject = subject;
	}
}
