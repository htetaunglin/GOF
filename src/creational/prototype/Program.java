package creational.prototype;

public class Program {
	public static void main(String[] args) {
		HeavyObject obj = new HeavyObject();
		HeavyObject obj2 = obj.produce();
		System.out.println(obj2);
	}
}
