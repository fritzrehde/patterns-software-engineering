public class Client {
	public static void main(String[] args) {
		boolean useFirstAlgorithm = false;

		Context context = new Context(useFirstAlgorithm);
		Policy policy = new Policy(context);

		policy.configure();
		context.executeAlgorithm();
	}
}
