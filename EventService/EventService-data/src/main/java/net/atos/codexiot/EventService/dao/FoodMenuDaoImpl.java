package net.atos.codexiot.EventService.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.atos.codexiot.EventService.pojo.CommentRating;
import net.atos.codexiot.EventService.pojo.FoodMenu;

@Transactional
@Repository
public class FoodMenuDaoImpl implements FoodMenuDao{
	
	@Autowired
	private SessionFactory sessionfactory;
	
	
	@Override
	public FoodMenu getFoodDetails(String foodId) {
		
		return (FoodMenu) sessionfactory.getCurrentSession().createQuery("select e from FoodMenu e where e.foodId =:foodId").setParameter("foodId", foodId).uniqueResult();
	}


	@Override
	public List<CommentRating> getCommentDetails(String foodId) {
		
		return (List<CommentRating>) sessionfactory.getCurrentSession().createQuery("select e from CommentRating e where e.foodId =:foodId").setParameter("foodId", foodId).list();
	}


	@Override
	public void saveCommentDetails(CommentRating cmr) {
		sessionfactory.getCurrentSession().saveOrUpdate(cmr);
		
	}



}
