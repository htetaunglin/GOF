package behaviour.observer;

public class Client implements Subscriber {
	private String name;

	public Client(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println("Hay... " + name + " Publisher change : " + message);
	}

}
