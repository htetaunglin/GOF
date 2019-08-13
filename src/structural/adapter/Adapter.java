package structural.adapter;

public class Adapter implements Framework {

	OldAPI oldAPI = new OldAPI();

	@Override
	public void add(Integer item) {
		oldAPI.addItem(item);
	}

}
