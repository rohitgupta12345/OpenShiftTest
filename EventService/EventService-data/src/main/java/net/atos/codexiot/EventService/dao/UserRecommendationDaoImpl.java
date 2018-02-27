package net.atos.codexiot.EventService.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.atos.codexiot.EventService.pojo.UserRecommendation;

@Transactional
@Repository
public class UserRecommendationDaoImpl implements UserRecommendationDao{

	@Autowired
	private SessionFactory sessionfactory;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserRecommendation> getAllRecommendation() {
		return this.sessionfactory.getCurrentSession().createQuery("select e from UserRecommendation e").list();		
	}

}
