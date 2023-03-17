public class Client {
	public static void main(String[] args) {
		// Pull variant
		ConcreteSubject<String> concreteSubject = new ConcreteSubject<>();
		ConcreteObserver<String> concreteObserver = new ConcreteObserver<>();
		concreteSubject.subscribe(concreteObserver);

		concreteSubject.setState("42");
		concreteSubject.setState("420");
	}
}
