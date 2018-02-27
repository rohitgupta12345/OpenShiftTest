package net.atos.codexiot.EventService.dao;

import net.atos.codexiot.EventService.pojo.FoodMenu;

import java.util.List;

import net.atos.codexiot.EventService.pojo.CommentRating;

public interface FoodMenuDao {

	public FoodMenu getFoodDetails(String foodId);
	public List<CommentRating> getCommentDetails(String foodId);
	public void saveCommentDetails(CommentRating cmr);
}
