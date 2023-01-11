package main.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.model.TemperatureChecker;


@Repository
public class TemperatureCheckerDAOImpl implements TemperatureCheckerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<TemperatureChecker> getAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from TemperatureChecker t", TemperatureChecker.class).list();
	}

	@Override
	public TemperatureChecker getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(TemperatureChecker.class, id);
	}

	@Override
	public void saveOrUpdate(TemperatureChecker temperatureChecker) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(temperatureChecker);
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		TemperatureChecker temperatureChecker = getById(id);
		session.delete(temperatureChecker);
	}


}
