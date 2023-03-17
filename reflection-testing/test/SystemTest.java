import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.fail;

@SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
class SystemTest {

	// exceptions: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/ReflectiveOperationException.html

	@Test
	void test() {
		try {
			// test if class "ConcreteProduct" exists
			Class concreteProduct = Class.forName("ConcreteProduct");

			try {
				// test if class "Product" exists
				Class product = Class.forName("Product");

				// test if class "Product" is an interface
				if (!product.isInterface()) {
					throw new ClassNotFoundException("Product not found");
				}

				// test if "ConcreteProduct" implements "Product"
				if (!product.isAssignableFrom(concreteProduct)) {
					fail("ConcreteProduct does not implement the Product interface");
				}

				try {
					// test if class "ConcreteProduct" offers default constructor
					Constructor constructor = concreteProduct.getDeclaredConstructor();

					// construct new instance of "ConcreteProduct"
					Object ConcreteProductConstructed = constructor.newInstance();

					// test if class "ConcreteProduct" offers custom constructor
					Constructor customConstructor = concreteProduct.getDeclaredConstructor(String.class);
					Object concreteProductConstructed = customConstructor.newInstance("constructor Name");

					try {
						// test if field/attribute "available" exists
						Field available = concreteProduct.getDeclaredField("available");

						// test if field/attribute "available" is private
						if (!Modifier.isPrivate(available.getModifiers())) {
							throw new NoSuchFieldException();
						}

						// test if "buy" works properly
						try {
							// test if method "buy" exists
							Method buyMethod = concreteProduct.getDeclaredMethod("buy");

							// invoke "concreteProductConstructed.buyMethod()"
							buyMethod.invoke(concreteProductConstructed);

							// required to access "available" field
							available.setAccessible(true);
							if (available.get(concreteProductConstructed).equals(true)) {
								throw new Exception("available should be false");
							}

							// invoke "concreteProductConstructed.rename("new Name")" and test if name is set correctly
							Method renameMethod = concreteProduct.getDeclaredMethod("rename", String.class);
							renameMethod.setAccessible(true);
							renameMethod.invoke(concreteProductConstructed, "new Name");
							Field nameField = concreteProduct.getDeclaredField("name");
							nameField.setAccessible(true);
							if (!nameField.get(concreteProductConstructed).equals("new Name")) {
								throw new Exception("name was not updated after rename method call");
							}

						} catch (Exception e) {
							fail("available was not updated correctly after buy call: " + e.getMessage());
						}

					} catch (NoSuchFieldException available) {
						fail("attribute available in class ConcreteProduct is not provided");
					}

				} catch (Exception e) {
					fail("ConcreteProduct does not provide a default constructor");
				}

			} catch (ClassNotFoundException product) {
				fail("interface Product not found");
			}

		} catch (ClassNotFoundException concreteProduct) {
			fail("class ConcreteProduct not found");
		}
	}
}
