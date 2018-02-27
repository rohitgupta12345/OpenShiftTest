package net.atos.codexiot.EventService.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.atos.codexiot.EventService.pojo.UserRecommendation;
import net.atos.codexiot.EventService.service.SmartLockerService;
import net.atos.codexiot.EventService.service.UserRecommendationService;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@Api(value = "UserRecommendation")
@RequestMapping(value = "/getAllUserRecommendation", produces = "application/json")
public class UserRecommendationController {
	
	@Autowired
	UserRecommendationService userRecommendationService ;
			// Apache logger
					private static final Logger logger = Logger
							.getLogger(EventController.class);
		
			@SuppressWarnings({ "rawtypes" })
			@CrossOrigin
			@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
			@ApiOperation(value = "Get All Event")
			@ApiResponses(value = { @ApiResponse(code = 200, message = "found data"),
					@ApiResponse(code = 404, message = "data not found") })
			@ResponseBody
			public ResponseEntity getEvent()
			{
				
				List<UserRecommendation> listEvent = userRecommendationService.getAllRecommendation();
				if(listEvent.isEmpty()){
					return ResponseEntity.status(404).body("{\"error\":\" no data found.\"}");
				}
				return ResponseEntity.status(200).body(listEvent);
			}
	

}
