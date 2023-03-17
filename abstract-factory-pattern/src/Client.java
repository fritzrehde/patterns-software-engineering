public class Client {
	public static void main(String[] args) {
		AbstractFactory factoryA = new ConcreteFactoryA();
		factoryA.createProduct1().print();
		factoryA.createProduct2().print();

		AbstractFactory factoryB = new ConcreteFactoryB();
		factoryB.createProduct1().print();
		factoryB.createProduct2().print();
	}
}
