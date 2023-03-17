import java.util.ArrayList;

public class ConcreteSubject<T> extends Subject<T> {
	private T state;

	public ConcreteSubject() {
		this.observers = new ArrayList<>();
	}

	public void subscribe(Observer<T> observer) {
		observers.add(observer);
		observer.setSubject(this);
	}

	public T getState() {
		return state;
	}

	public void setState(T state) {
		this.state = state;
		System.out.println("ConcreteSubject updated: " + state);
		customNotify();
	}
}
