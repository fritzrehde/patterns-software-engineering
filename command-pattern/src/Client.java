public class Client {

	public static void main(String[] args) {
		Light light = new Light();
		LightSwitch lightSwitch = new LightSwitch();

		lightSwitch.controlSwitch(new FlipUpCommand(light));
		lightSwitch.controlSwitch(new FlipDownCommand(light));
	}

}
