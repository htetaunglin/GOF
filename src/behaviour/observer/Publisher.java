package behaviour.observer;

public interface Publisher {

	void attach(Subscriber subscriber);

	void change(String message);
}
