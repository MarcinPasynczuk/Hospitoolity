package main.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.model.TemperatureCheckerDetails;

@Repository
public class TemperatureCheckerDetailsDAOImpl implements TemperatureCheckerDetailsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public TemperatureCheckerDetails getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(TemperatureCheckerDetails.class, id);
	}

	@Override
	public void saveOrUpdate(TemperatureCheckerDetails temperatureCheckerDetails) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(temperatureCheckerDetails);
		
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		TemperatureCheckerDetails tourDetails = getById(id);
		session.delete(tourDetails);
		
	}

	

}
