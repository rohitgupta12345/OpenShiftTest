package net.atos.codexiot.EventService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.atos.codexiot.EventService.pojo.CommentRating;
import net.atos.codexiot.EventService.pojo.FoodMenu;
import net.atos.codexiot.EventService.service.FoodMenuServices;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@Api(value = "FoodMenu")
@RequestMapping(value = "/Food", produces = "application/json")
public class FoodMenuController {

	@Autowired FoodMenuServices foodser;
	
	@SuppressWarnings("rawtypes")
	@CrossOrigin
	@RequestMapping(value = "/getFoodDetails/{foodId}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Getting Food Details ", notes = "", response = FoodMenu.class)
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Event are fetched."),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 404, message = "No  data found"),
			@ApiResponse(code = 400, message = "Bad request! Required field missing"),
			@ApiResponse(code = 409, message = "Search results not found.") })
	@ResponseBody
	public ResponseEntity getBookingDetails(
			@ApiParam(value = "foodId", required = true) @PathVariable("foodId")  String foodId) {	
	//	BookingDetailsModel bdm=new BookingDetailsModel();
		
	
		
		
		return ResponseEntity.status(200).body(foodser.getFoodMenuService(foodId)); 
	
	}
	
	
	
	@SuppressWarnings("rawtypes")
	@CrossOrigin
	@RequestMapping(value = "/getFoodComments/{foodId}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Getting Food Details ", notes = "", response = FoodMenu.class)
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Event are fetched."),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 404, message = "No  data found"),
			@ApiResponse(code = 400, message = "Bad request! Required field missing"),
			@ApiResponse(code = 409, message = "Search results not found.") })
	@ResponseBody
	public ResponseEntity getFoodComment(
			@ApiParam(value = "foodId", required = true) @PathVariable("foodId")  String foodId) {	
	
		
		
		return ResponseEntity.status(200).body(foodser.getFoodCommentService(foodId)); 
	
	}
	
	@SuppressWarnings("rawtypes")
	@CrossOrigin
	@RequestMapping(value = "/postFoodComments", method = RequestMethod.POST, produces = "application/json")
	@ApiOperation(value = "Getting Food Details ", notes = "", response = FoodMenu.class)
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Event are fetched."),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 404, message = "No  data found"),
			@ApiResponse(code = 400, message = "Bad request! Required field missing"),
			@ApiResponse(code = 409, message = "Search results not found.") })
	@ResponseBody
	public ResponseEntity postFoodComment(@RequestBody CommentRating cmr) {	
	
		foodser.saveFoodCommentService(cmr);
		
		return ResponseEntity.status(200).body("{\"success\":\"comments and rating saved.\"}"); 
	
	}
	
	
}
