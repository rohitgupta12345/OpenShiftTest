package net.atos.codexiot.EventService.service;

import java.util.List;

import net.atos.codexiot.EventService.pojo.CommentRating;
import net.atos.codexiot.EventService.pojo.FoodMenu;

public interface FoodMenuServices {

	public FoodMenu getFoodMenuService(String foodId) ;
	public List<CommentRating> getFoodCommentService(String foodId) ;
	public void saveFoodCommentService(CommentRating cmr) ;
	
}
