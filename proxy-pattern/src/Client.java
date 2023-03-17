public class Client {
	public static void main(String[] args) {
		boolean hasAccess = true;
		Subject proxy = new Proxy(hasAccess);

		// some time passes

		proxy.request();
	}
}
