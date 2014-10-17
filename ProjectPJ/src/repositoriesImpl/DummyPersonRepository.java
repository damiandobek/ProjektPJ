package repositoriesImpl;

import java.util.List;

import domain.Person;
import repositories.IRepository;

public class DummyPersonRepository implements IRepository<Person> {

	public domain.Person get(int id) {
		return null;
	}

	public List<Person> getAll() {
		return null;
	}

	public void add(Person entity) {
		
	}

	
	public void delete(Person entity) {
	}

	public void update(Person entity) {
	}

}


