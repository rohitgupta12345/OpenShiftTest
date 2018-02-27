package net.atos.codexiot.EventService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.atos.codexiot.EventService.dao.UserRecommendationDao;
import net.atos.codexiot.EventService.pojo.UserRecommendation;

@Transactional
@Repository
public class UserRecommendationServiceImpl implements UserRecommendationService{
	
	@Autowired
	UserRecommendationDao UserRecommendation;
	@Override
	public List<UserRecommendation> getAllRecommendation() {
		// TODO Auto-generated method stub
		return UserRecommendation.getAllRecommendation();
	}

}
