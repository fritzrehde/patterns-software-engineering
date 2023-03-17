public class ConcreteProduct implements Product {
	private String name;
	private boolean available;

	public ConcreteProduct() {
		this.name = "unused";
		this.available = true;
	}
	public ConcreteProduct(String s) {
		this.name = s;
		this.available = true;
	}

	public void buy() {
		this.available = false;
	}

	public void sell() {
		this.available = true;
	}

	private void rename(String newName) {
		this.name = newName;
	}
}
