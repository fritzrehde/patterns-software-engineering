public class ConcreteFactoryA implements AbstractFactory {
	@Override
	public Product1 createProduct1() {
		return new Product1A();
	}

	@Override
	public Product2 createProduct2() {
		return new Product2A();
	}
}
