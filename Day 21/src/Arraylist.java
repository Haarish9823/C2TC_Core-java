import java.util.ArrayList;
import java.util.Collection;

public class Arraylist {

	public static void main(String[] args) {
		Collection list = new ArrayList();

		list.add(100);

		list.add(10);

		list.add(1000);

		list.add("Webinar");

		System.out.println("ArrayList : " + list);
	}

}
// output
// ArrayList : [100, 10, 1000, Webinar]