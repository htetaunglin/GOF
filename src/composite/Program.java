package structural.composite;

/*
 * Note is here (credit to Ko Thet Khine)
 * https://www.facebook.com/notes/thet-khine/object-oriented-design-pattern-series-part-8-composite-design-pattern/10205619680690872/?hc_location=ufi
 */
public class Program {

	public static void main(String[] args) {

		ViewGroup parentViewGroup = new ViewGroup("parentGroup");
		View view1 = new View("View 1 in parentGroup");
		View view2 = new View("View 2 in parentGroup");
		parentViewGroup.add(view1);
		parentViewGroup.add(view2);

		ViewGroup viewGroup2 = new ViewGroup("ViewGroup2");
		viewGroup2.add(new View("View 1 in ViewGroup2"));

		parentViewGroup.add(viewGroup2);

		parentViewGroup.paint();

	}
}
