package uppgift1;

public class PublisherTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * 
		 */
		Publisher publisher1 = new Publisher("Bionners", "12345679");

		Skrivare.skrivUt("to string test av pb1");
		Skrivare.skrivUt(publisher1.toString());

		Publisher publisher2 = new Publisher("google", "08080808");
		Skrivare.skrivUt("get test av pb2");
		Skrivare.skrivUt("Antal förlag" + Publisher.getCount());
		Skrivare.skrivUt("name " + publisher2.get_name());
		Skrivare.skrivUt("phone " + publisher2.get_phone() + "\n");

		Publisher publisher3 = new Publisher();
		publisher3.set_name("cet");
		publisher3.set_phone("854852588");

		Skrivare.skrivUt("pritn test av pb3");
		publisher3.print();

	}

}
