package practice;

import java.util.HashMap;

public class PracticeThings {
	
	
	public void hashMapMethod() {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("Mexico", "Guadalajara");
		
		for (String i : capitalCities.keySet()) {
			System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		PracticeThings hash = new PracticeThings();
		hash.hashMapMethod();
		

	}

}
