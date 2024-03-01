package hu.ibello.api.assertions;
import java.util.List;

public class Assertions {
	
	public Assertions() {
		super();
	}

	public void assertIsNotNull(Object o) {
		if (o == null) {
			throw new AssertionError("Given object is null!");
		}
	}

	public void assertIsNotEmpty(List<?> list) {
		if (list.isEmpty()) {
			throw new AssertionError("Given list is empty!");
		}
	}

}
