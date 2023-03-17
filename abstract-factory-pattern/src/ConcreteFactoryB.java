public class ConcreteFactoryB implements AbstractFactory {
	@Override
	public Product1 createProduct1() {
		return new Product1B();
	}

	@Override
	public Product2 createProduct2() {
		return new Product2B();
	}
}
