public class Proxy extends Subject {
	private RealSubject realSubject;
	private final boolean hasAccess;

	public Proxy(boolean hasAccess) {
		this.hasAccess = hasAccess;
	}

	@Override
	void request() {
		if (hasAccess) {
			System.out.println("Access granted.");
			if (realSubject == null) {
				this.realSubject = new RealSubject();
			}

			realSubject.request();
		} else {
			System.out.println("Access denied.");
		}
	}
}
