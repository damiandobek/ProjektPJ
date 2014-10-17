package repositoriesImpl;

import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.IUserRepository;
import domain.Address;
import domain.Person;

public class DummyRepositoryCatalog implements IRepositoryCatalog {

	private DummyDb db;
	
	public IRepository<Person> getPersons() {
		
		return null;
	}

	
	public IRepository<Address> getAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public IUserRepository getUsers() {
		return new DummyUserRepository(db);
	}


	public IRepository<Person> getPersones() {
		// TODO Auto-generated method stub
		return null;
	}

}
