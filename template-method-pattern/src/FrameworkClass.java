public abstract class FrameworkClass {
	public abstract void stepOne();
	public void stepTwo() {
		System.out.println("Step 2: This is the same for all applications");
	}
	public abstract void stepThree();

	public void templateMethod() {
		stepOne();
		stepTwo();
		stepThree();
	}
}
