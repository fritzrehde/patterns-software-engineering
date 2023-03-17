// Concrete Builder
public class MargheritaPizzaBuilder implements Builder<Pizza> {
	Pizza pizza;

	@Override
	public Builder<Pizza> buildDough() {
		pizza.setDough("thick crust");
		return this;
	}

	@Override
	public Builder<Pizza> buildSauce() {
		pizza.setSauce("mild");
		return this;
	}

	@Override
	public Builder<Pizza> buildTopping() {
		pizza.setTopping("cheese");
		return this;
	}

	@Override
	public Builder<Pizza> reset() {
		this.pizza = new Pizza();
		return this;
	}

	@Override
	public Pizza getResult() {
		return pizza;
	}
}
