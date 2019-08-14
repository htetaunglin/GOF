package behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements Publisher {

	List<Subscriber> list = new ArrayList<Subscriber>();

	@Override
	public void attach(Subscriber subscriber) {
		list.add(subscriber);
	}

	@Override
	public void change(String message) {
		System.out.println("Publisher Change : " + message);
		for (Subscriber sub : list) {
			sub.update(message);
		}

	}

}
