package behaviour.strategy;

public class Context {

	private SortStrategy sortStrategy;

	public void setSortStrategy(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public SortStrategy getSortStrategy() {
		return sortStrategy;
	}

	public void sort() {
		sortStrategy.sort();
	}
}
