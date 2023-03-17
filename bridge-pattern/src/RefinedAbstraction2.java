public class RefinedAbstraction2 extends Abstraction {
	public RefinedAbstraction2() {
		super(new ConcreteImplementation2());
	}

	@Override
	void operationAbstract() {
		implementation.operationImpl();
	}
}
