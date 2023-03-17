// Director
class Waiter {
	private Builder<Pizza> builder;

	public Waiter(Builder<Pizza> builder) {
		this.builder = builder;
	}

	public void changeBuilder(Builder<Pizza> newBuilder) {
		this.builder = newBuilder;
	}

	public Pizza make(String type) {
		builder.reset();
		if (type.equals("special dough")) {
			builder.buildDough();
		}
		builder
			.buildSauce()
			.buildTopping();

		return builder.getResult();
	}
}
