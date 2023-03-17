public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("root");

		Composite comp2 = new Composite("comp2");
		root.addComponent(comp2);

		Leaf three = new Leaf("leaf2");
		comp2.addComponent(three);

		Leaf two = new Leaf("leaf1");
		root.addComponent(two);

		root.print();
	}
}
