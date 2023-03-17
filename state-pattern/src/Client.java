public final class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.printCurrentState();

		context.requestNextState();
		context.printCurrentState();

		context.requestNextState();
		context.printCurrentState();

		context.requestNextState();
		context.printCurrentState();
	}
}
