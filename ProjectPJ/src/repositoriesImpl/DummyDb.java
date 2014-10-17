package repositoriesImpl;

import java.util.*;

import domain.*;

public class DummyDb {

	public List<Person> persons;
	public List<User> users;
	public List<Address> addresses;
	public List<Role> roles;
	
	public DummyDb()
	{
		persons = new ArrayList<Person>();
		users = new ArrayList<User>();
		roles =new ArrayList<Role>();
		addresses = new ArrayList<Address>();
	}
}