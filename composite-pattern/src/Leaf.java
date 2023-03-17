public class Leaf extends Component {
	public Leaf(String name) {
		this.name = name;
	}

	@Override
	void operation() {
		System.out.println("Leaf");
	}

	@Override
	void print(int level) {
		printLevels(level);
		System.out.println(name);
	}
}
