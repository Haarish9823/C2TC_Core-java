import java.util.ArrayList;
import java.util.List;

public class Methodaddall {

	public static void main(String[] args) {
		List<String> val1 = new ArrayList<>();
		val1.add("corona can be stopped");
		List<String> val2 = new ArrayList<>();
		val2.add("stay at home");
		val1.addAll(val2);
		System.out.println(val1);
	}

}
// [corona can be stopped, stay at home]