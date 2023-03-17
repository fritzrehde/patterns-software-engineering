public class Client {
	public static void main(String[] args) {
		ClientInterface clientInterface = new Adapter();
		clientInterface.request();
	}
}
