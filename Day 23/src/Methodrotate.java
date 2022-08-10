import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Methodrotate {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("practice");
		list.add("code");
		list.add("every");
		list.add("day");
		System.out.println("Original List : " + list);
		Collections.rotate(list, 2);

		System.out.println("Rotated List: " + list);

	}

}
//Original List : [practice, code, every, day]
//Rotated List: [every, day, practice, code]
