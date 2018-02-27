package net.atos.codexiot.EventService.dao;

import java.util.List;

import net.atos.codexiot.EventService.pojo.UserRecommendation;

public interface UserRecommendationDao {
	
	List<UserRecommendation> getAllRecommendation();
}
