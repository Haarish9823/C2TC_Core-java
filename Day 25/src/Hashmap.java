import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
			HashMap<String, Double> bike = new HashMap<String,
			Double>();
			bike.put("Gixxer", 155.5);
			bike.put("Royal Enfield", 350.00);
			bike.put("KTM RC 390", 373.5);
			bike.put("RE Himalayan", 410.00);
			System.out.println(bike.values());
			System.out.println(bike.size());
	}

}
//[373.5, 155.5, 350.0, 410.0]
//4