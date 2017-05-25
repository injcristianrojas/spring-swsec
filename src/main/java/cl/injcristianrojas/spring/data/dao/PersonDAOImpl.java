package cl.injcristianrojas.spring.data.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cl.injcristianrojas.spring.data.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<Person> getAllPersons() {
		Session session = sessionFactory.openSession();
		String hql = "FROM person";
		Query query = session.createQuery(hql);
		return query.list();
	}

	@Override
	public void insertPerson(Person person) {
		Session session = sessionFactory.openSession();
		session.save(person);
	}

	

}
