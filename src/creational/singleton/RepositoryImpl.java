package creational.singleton;

public class RepositoryImpl implements Repository {

	private static Repository repository;

	private RepositoryImpl() {
	}

	public static Repository getInstance() {
		if (repository == null)
			repository = new RepositoryImpl();
		return repository;
	}

	@Override
	public void create() {
		System.out.println("Create");

	}

	@Override
	public void delete() {
		System.out.println("Delete");

	}

}
