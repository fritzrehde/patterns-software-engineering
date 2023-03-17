// Concrete Command
public class FlipUpCommand implements LightSwitchCommand {
	private Light light;

	public FlipUpCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOn();
	}
}
