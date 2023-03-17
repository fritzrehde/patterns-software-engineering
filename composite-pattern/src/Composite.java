import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	List<Component> children;

	public Composite(String name) {
		this.name = name;
		this.children = new ArrayList<>();
	}

	@Override
	void operation() {
		System.out.println("Composite");
	}

	@Override
	void print(int level) {
		printLevels(level);
		System.out.println(name);

		for (Component component : children) {
			component.print(level + 1);
		}
	}

	public void addComponent(Component component) {
		children.add(component);
	}

	public void removeComponent(Component component) {
		children.remove(component);
	}

	public List<Component> getChildren() {
		return children;
	}
}
