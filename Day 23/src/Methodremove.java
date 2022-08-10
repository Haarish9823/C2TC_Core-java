import java.util.ArrayList;
import java.util.List;

public class Methodremove {

	public static void main(String[] args) {
		List<Integer> val = new ArrayList<>();
		val.add(0);
		val.add(11);
		val.add(23);
		val.add(34);
		val.add(45);
		val.remove(1);
		System.out.println("ArrayList : " + val);
	}

}
// ArrayList : [0, 23, 34, 45]