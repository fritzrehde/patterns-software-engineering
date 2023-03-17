// Concrete Command
public class FlipDownCommand implements LightSwitchCommand {
	private Light light;

	public FlipDownCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOff();
	}
}
