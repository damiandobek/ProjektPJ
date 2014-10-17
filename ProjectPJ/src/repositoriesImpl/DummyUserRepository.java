package repositoriesImpl;

import java.util.List;

import domain.Role;
import domain.User;
import repositories.IUserRepository;

public class DummyUserRepository implements IUserRepository{

	private DummyDb db;
	
	public DummyUserRepository(DummyDb db) {
		super();
		this.db = db;
	}

	public User get(int id) {
		for(User u : db.users)
		{
			if(u.getId()==id)
				return u;
		}
		return null;
	}

	public List<User> getAll() {
		return db.users;
	}

	
	public void add(User entity) {

		db.users.add(entity);
		
	}

	public void delete(User entity) {

		db.users.remove(entity);
		
	}

	public void update(User entity) {
		
	}

	public List<User> withRole(Role role) {
		
		return withRole(role.getId());
	}
	
	public List<User> withRole(String roleName) {

		Role role = null;
		for(Role r : db.roles)
		{
			if(r.getName().equalsIgnoreCase(roleName))
			{
				role = r;
				break;
			}
		}
		if(role==null)return null;
		return role.getUser();
	}

	public List<User> withRole(int roleId) {

		Role role = null;
		for(Role r : db.roles)
		{
			if(r.getId()==roleId)
			{
				role = r;
				break;
			}
		}
		if(role==null)return null;
		return role.getUser();
	}

}
