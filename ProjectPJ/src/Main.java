
import domain.*;
import repositories.IRepositoryCatalog;
import repositoriesImpl.DummyRepositoryCatalog;


public class Main {

	public static void main(String[] args) {
		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		Person person = new Person();
		User user = new User();
		
		person.setUser("damiandobek");
		person.setFirstName("Damian");
		person.setEmail("s11770@pjwstk.edu.pl");
		person.setSex("M");
		
		user.setLogin("damianD");
		user.setPassword("*******");
		
		//i tak dalej...
		
		System.out.println(person.getUser());
		System.out.println(person.getFirstName());
		System.out.println(person.getEmail());
		System.out.println(person.getSex());
		System.out.println(user.getLogin());
		System.out.println(user.getPassword());
		
	}

}