public class Factory {
	public Product createProduct(String type) {
		/*
		if (type.equals("product a")) {
			return new ConcreteProductA();
		} else if (type.equals("product b")) {
			return new ConcreteProductB();
		} else {
			throw new UnknownProductException("Unknown product: " + type);
		}
		*/

		switch (type) {
			case "product a" -> {
				return new ConcreteProductA();
			}
			case "product b" -> {
				return new ConcreteProductB();
			}
			default -> throw new UnknownProductException("Unknown product: " + type);
		}
	}
}
