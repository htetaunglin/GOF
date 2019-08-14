package behaviour.observer;

/*
 * Observer Pattern's Note (Credit to Ko Thet Khine)
 * https://www.facebook.com/notes/thet-khine/object-oriented-design-pattern-series-part-10-observer-design-pattern/10205760595613657/?hc_location=ufi
 * 
 */
public class Program {

	public static void main(String[] args) {

		Publisher publisher = new DataSource();

		Client client1 = new Client("Maung Maung");
		Client client2 = new Client("Aung Aung");

		publisher.attach(client1);
		publisher.attach(client2);

		publisher.change("Publisher change1");

		publisher.change("Publisher change2");

	}

}
