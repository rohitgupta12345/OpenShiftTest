package net.atos.codexiot.EventService.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.atos.codexiot.EventService.dao.FoodMenuDao;
import net.atos.codexiot.EventService.pojo.CommentRating;
import net.atos.codexiot.EventService.pojo.FoodMenu;

@Transactional
@Repository
public class FoodMenuServicesImpl implements FoodMenuServices{

	@Autowired
	FoodMenuDao fooddao;
	
	
	@Override
	public FoodMenu getFoodMenuService(String foodId) {
		
		return fooddao.getFoodDetails(foodId);
	}


	@Override
	public List<CommentRating> getFoodCommentService(String foodId) {
		
		return fooddao.getCommentDetails(foodId);
	}


	@Override
	public void saveFoodCommentService(CommentRating cmr) {
		fooddao.saveCommentDetails(cmr);
		
	}

	
	
}
