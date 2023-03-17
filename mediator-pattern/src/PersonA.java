public class PersonA extends Person {
	public PersonA(Mediator mediator) {
		super(mediator);
	}

	public void receive(String message) {
		System.out.println("Person A received: " + message);
	}
}
