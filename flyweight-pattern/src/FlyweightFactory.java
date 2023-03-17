import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static final Map<RepeatingState, Flyweight> cache = new HashMap<>();

	private FlyweightFactory() {
	}

	public static Flyweight getFlyweight(RepeatingState repeatingState) {
		if (cache.get(repeatingState) == null) {
			cache.put(repeatingState, new Flyweight(repeatingState));
		}
		return cache.get(repeatingState);
	}
}
