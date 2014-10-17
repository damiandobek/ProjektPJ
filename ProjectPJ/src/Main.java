import java.util.List;

import domain.User;
import repositories.IRepositoryCatalog;
import repositoriesImpl.DummyRepositoryCatalog;


public class Main {

	public static void main(String[] args) {

		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		
		List<User> admin = catalog.getUsers().withRole("administrator");
		
	}

}