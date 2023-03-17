public abstract class Abstraction {
	Implementor implementation;

	public Abstraction(Implementor implementation) {
		this.implementation = implementation;
	}

	abstract void operationAbstract();
}
