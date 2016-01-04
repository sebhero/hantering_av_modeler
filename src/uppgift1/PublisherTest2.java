package uppgift1;
public class PublisherTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Publisher pb1 = new Publisher();
		Skrivare.skrivUt("vänligen fyll i information om förlaget\n");

		pb1.set_name(Skrivare.ask("Namn på förelaget?"));
		pb1.set_phone(Skrivare.ask("telefonnummer till förelaget?"));
		Skrivare.skrivUt("du har lagt till förlaget:");
		pb1.print();
	}
}
