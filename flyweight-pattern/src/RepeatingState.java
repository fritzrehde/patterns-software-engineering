// Intrinsic / immutable state: expensive to instantiate => reused
public class RepeatingState implements State {
	private final String content;

	public RepeatingState(String content) {
		this.content = content;
	}
	public String display() {
		return this.content;
	}
}
