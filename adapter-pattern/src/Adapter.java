public class Adapter implements ClientInterface {
	LegacyClass adaptee;

	public Adapter() {
		this.adaptee = new LegacyClass();
	}

	@Override
	public void request() {
		adaptee.existingRequest();
	}
}
