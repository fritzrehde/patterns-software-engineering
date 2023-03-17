public final class Client {
	public static void main(String[] args) {
		Factory factory = new Factory();

		factory.createProduct("product a").print();
		factory.createProduct("product b").print();
		// exception: unknown product
		// factory.createProduct("product c").print();
	}
}
