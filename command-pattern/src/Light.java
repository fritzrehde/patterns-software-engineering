// Receiver
public class Light {
	private String state;

	public Light() {
		this.state = "off";
	}
	public void turnOn() {
		this.state = "on";
		this.printAction();
	}

	public void turnOff() {
		this.state = "off";
		this.printAction();
	}

	private void printAction() {
		System.out.println("Switched light " + this.state);
	}

}
