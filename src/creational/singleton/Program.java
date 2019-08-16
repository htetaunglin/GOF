package creational.singleton;

public class Program {

	public static void main(String[] args) {

		Repository repo = RepositoryImpl.getInstance();

		repo.create();

		repo.delete();
	}

}
