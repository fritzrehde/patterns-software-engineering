// Extrinsic / mutable state: cheap to instantiate
public class UniqueState implements State {
	private final String content;

	public UniqueState(String content) {
		this.content = content;
	}

	@Override
	public String display() {
		return this.content;
	}
}
