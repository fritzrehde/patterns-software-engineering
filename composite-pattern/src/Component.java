public abstract class Component {
	String name;

	abstract void operation();

	public void print() {
		print(0);
	}

	abstract void print(int level);

	public void printLevels(int level) {
		for (int i = 0; i < level; ++i) {
			System.out.print("-");
		}
	}
}
