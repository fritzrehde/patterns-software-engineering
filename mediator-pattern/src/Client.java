public final class Client {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();

		PersonA allan = new PersonA(mediator);
		PersonA barbara = new PersonA(mediator);
		PersonB cleo = new PersonB(mediator);

		mediator.addPerson(allan);
		mediator.addPerson(barbara);
		mediator.addPerson(cleo);

		allan.send("Hello World from Allan");
		cleo.send("Hello from Cleo");
	}
}
