import java.util.ArrayList;
import java.util.List;

public final class ConcreteMediator implements Mediator {
	private final List<Person> people;

	public ConcreteMediator() {
		this.people = new ArrayList<>();
	}

	public void addPerson(Person person) {
		people.add(person);
	}

	@Override
	public void send(String message, Person sender) {
		for (Person receiver : people) {
			if (sender != receiver) {
				receiver.receive(message);
			}
		}
	}
}
