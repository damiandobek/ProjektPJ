package repositories;

import domain.Address;
import domain.Person;

public interface IRepositoryCatalog {

	public IRepository<Person> getPersones();
	public IRepository<Address> getAddresses();
	public IUserRepository getUsers();
}
