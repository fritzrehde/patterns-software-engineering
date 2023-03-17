public abstract class Person {
	private final Mediator mediator;
	public Person(Mediator mediator) {
		this.mediator = mediator;
	}
	public void send(String message) {
		mediator.send(message, this);
	}

	public abstract void receive(String message);
}
