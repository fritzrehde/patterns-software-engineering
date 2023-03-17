import java.util.List;

public abstract class Subject<T> {
	List<Observer<T>> observers;

	public abstract void subscribe(Observer<T> observer);

	public void unsubscribe(Observer<T> observer) {
		observers.remove(observer);
	}

	public void customNotify() {
		for (Observer<T> observer : observers) {
			observer.update();
		}
	}
}
