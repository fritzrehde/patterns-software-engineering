public class RealSubject extends Subject {
	@Override
	void request() {
		System.out.println("Very expensive operation.");
	}
}
