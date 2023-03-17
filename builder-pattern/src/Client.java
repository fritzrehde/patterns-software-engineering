// this example code has been adapted from https://sourcemaking.com/design_patterns/builder/java/2
public class Client {
	public static void main(String[] args) {
		Waiter waiter = new Waiter(new HawaiianPizzaBuilder());

		Pizza pizza = waiter.make("simple");
		System.out.println(pizza.toString());

		waiter.changeBuilder(new MargheritaPizzaBuilder());

		Pizza pizza2 = waiter.make("special dough");
		System.out.println(pizza2.toString());
	}
}
