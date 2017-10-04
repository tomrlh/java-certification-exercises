import java.util.List;
import java.util.ArrayList;

public class Finalizer {
	private static List objects = new ArrayList();

	protected void finalize() {
		System.out.println("finalize");
		objects.add(this); // Don't do this
	}
}