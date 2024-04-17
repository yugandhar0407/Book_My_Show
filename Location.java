package Project;

import java.util.Arrays;
import java.util.Scanner;

import static Project.Main.sc;

public abstract class Location {
	abstract void city();
}

class City extends Location {
	Scanner sc = new Scanner(System.in);
	String City_Name;
	int CityNumber;
	String[] cities = { "Amalapuram", "Bhimavaram", "Eluru", "Guntur", "Kakinada", "Nellore", "Rajahmundry",
			"Srikakulam", "Tirupathi", "Vijayanagaram", "Vijayawada", "Vizag", "Adilabad", "Hyderabad", "Karimnagar",
			"Khammam", "Mahabubnagar", "Medak", "Nalgonda", "Nizamabad", "Warangal" };

	City() {
		System.out.println("Please Select Your City");
		city();
	}

	void city() {
		System.out.println(
				"AndraPradesh:-  1.Amalapuram       2.Bhimavaram    3.Eluru \n                4.Guntur           5.Kakinada      6.Nellore\n                7.Rajahmundry      8.Srikakulam    9.Tirupathi\n                10.Vijayanagaram   11.Vijayawada   12.Vizag");
		System.out.println(
				"\nTelangana:-     13.Adilabad        14.Hyderabad    15.Karimnagar \n                16.Khammam         17.Mahabubnagar 18.Medak\n                19.Nalgonda        20.Nizamabad    21.Warangal");
		CityNumber = citynumbercheck(sc.next());
		City_Name = cities[CityNumber - 1];
	}

	int citynumbercheck(String a) {
		if (a.length() == 1 && a.charAt(0) > '0' && a.charAt(0) <= '9') {
			return Integer.parseInt(a);

		} else if (a.length() == 2 && (a.charAt(0) == '1' || a.charAt(0) == '2') && a.charAt(1) >= '0'
				&& a.charAt(1) <= '9') {
			if (Integer.parseInt(a) < 22) {
				return Integer.parseInt(a);
			} else {
				System.out.println("Please enter valid city number");
				return citynumbercheck(sc.next());
			}
		} else {
			System.out.println("Please enter valid city number");
			return citynumbercheck(sc.next());
		}

	}
}
