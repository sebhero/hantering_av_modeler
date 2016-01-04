package uppgift3;

import uppgift1.Publisher;
import uppgift1.Skrivare;
import uppgift2.CD;

public class CDTest {
	public static void main(String[] args) {

		CD cd1 = new CD("MAMMA MIA", "ABBA", 90, new Publisher(
				"Seb recordstore", "123456879"));
		cd1.print();

		CD cd2 = new CD();
		cd2.set_title("Rise and fire");
		cd2.set_artist("Hammerfall");
		cd2.set_length(90);
		// update to test set publisher with 2 params.
		cd2.set_publisher("Jonas superstore", "123123123123");
		cd2.print();

		CD cd3 = new CD();
		Skrivare.skrivUt("Fyll i info om cd skivan");
		cd3.set_title(Skrivare.ask("vad är titeln på Cdn?"));
		cd3.set_artist(Skrivare.ask("vilken artist är det?"));
		cd3.set_length(getMinutesOfCD());

		Publisher pb1 = new Publisher();
		Skrivare.skrivUt("vänligen fyll i information om förlaget\n");

		pb1.set_name(Skrivare.ask("Namn på förelaget?"));
		pb1.set_phone(Skrivare.ask("telefonnummer till förelaget?"));

		cd3.set_publisher(pb1);
		cd3.print();
	}

	private static int getMinutesOfCD() {
		try {
			String strMin = Skrivare.ask("hur många minuter är skivan?");
			return Integer.parseInt(strMin);
		} catch (NumberFormatException e) {
			Skrivare.skrivUt("ogiltigt nummer!");
			return getMinutesOfCD();
		}

	}
}
