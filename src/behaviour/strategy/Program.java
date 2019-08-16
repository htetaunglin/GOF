package behaviour.strategy;

/*
 * Strategy Pattern's Note (credit to Ko Thet Khine)
 * https://www.facebook.com/notes/thet-khine/object-oriented-design-pattern-series-part-16-strategy-design-pattern/10207314788227501/?fref=mentions
 */
public class Program {

	public static void main(String[] args) {

		Context context = new Context();

		context.setSortStrategy(new MergeSort());
		context.sort();

		context.setSortStrategy(new SelectionSort());
		context.sort();

	}

}
