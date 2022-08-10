import java.util.ArrayList;
import java.util.List;

public class Methodclear {

	public static void main(String[] args) {
		List<String> val = new ArrayList<>();
		val.add("JAVA");
		val.add("is");
		val.add("Interesting");
		System.out.println("before clear :" +val);
		val.clear();
		System.out.println("after clear :" +val);
	}

}
// before clear :[JAVA, is, Interesting]
// after clear :[]