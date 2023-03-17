public class PersonB extends Person {
	public PersonB(Mediator mediator) {
		super(mediator);
	}

	public void receive(String message) {
		System.out.println("Person B received: " + message);
	}
}
