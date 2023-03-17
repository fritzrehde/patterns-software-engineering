import java.util.Objects;

// Product
public class Pizza {
	private String dough = "default";
	private String sauce = "default";
	private String topping = "default";

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		return "Pizza:\n"
			+ "\t> Dough: " + Objects.requireNonNullElse(dough, "None") + "\n"
			+ "\t> Sauce: " + Objects.requireNonNullElse(sauce, "None") + "\n"
			+ "\t> Toppings: " + Objects.requireNonNullElse(topping, "None") + "\n";
	}
}
