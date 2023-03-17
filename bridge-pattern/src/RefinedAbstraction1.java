public class RefinedAbstraction1 extends Abstraction {
	public RefinedAbstraction1() {
		super(new ConcreteImplementation1());
	}

	@Override
	void operationAbstract() {
		implementation.operationImpl();
	}
}
