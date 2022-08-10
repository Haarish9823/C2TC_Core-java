import java.util.ArrayList;
import java.util.Collections;

public class Methodshuffle {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Python");
		list.add(".net");
		list.add("Compiler");
		Collections.shuffle(list);
		System.out.println("Results after shuffle operation:"+ list);
		Collections.shuffle(list);
		System.out.println("Results after shuffle operation:");
	}

}
//Results after shuffle operation:[Python, Compiler, .net, C]
//Results after shuffle operation:
