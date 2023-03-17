public class Client {
	public static void main(String[] args) {
		RepeatingState repeatingState = new RepeatingState("REPEATING STATE");
		RepeatingState repeatingState2 = new RepeatingState("REPEATING STATE2");
		UniqueState uniqueState = new UniqueState("unique state");
		UniqueState uniqueState2 = new UniqueState("unique state2");

		// create many contexts
		Context[] contexts = new Context[10];
		int i = 0;
		for (; i < 5; ++i) {
			contexts[i] = new Context(uniqueState, repeatingState2);
		}
		for (; i < 10; ++i) {
			contexts[i] = new Context(uniqueState2, repeatingState);
		}

		// execute operations
		for (int j = 0; j < 10; ++j) {
			contexts[j].operation();
		}
	}
}
