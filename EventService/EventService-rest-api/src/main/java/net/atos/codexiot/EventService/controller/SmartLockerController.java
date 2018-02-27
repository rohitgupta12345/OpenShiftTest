package net.atos.codexiot.EventService.controller;




	import java.util.List;

	import io.swagger.annotations.Api;
	import io.swagger.annotations.ApiOperation;
	import io.swagger.annotations.ApiResponse;
	import io.swagger.annotations.ApiResponses;
import net.atos.codexiot.EventService.pojo.SmartLocker;
import net.atos.codexiot.EventService.service.SmartLockerService;

import org.apache.log4j.Logger;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;

	import springfox.documentation.swagger2.annotations.EnableSwagger2;


	/**
	 * @author a622693
	 *
	 */

	@RestController
	@EnableSwagger2
	@Api(value = "SmartLocker")
	@RequestMapping(value = "/SmartLocker", produces = "application/json")
	
	public class SmartLockerController {
		// UserService Interface Reference
	@Autowired
SmartLockerService smartLockerService ;
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
			
			List<SmartLocker> listEvent = smartLockerService.getallLocker();
			if(listEvent.isEmpty()){
				return ResponseEntity.status(404).body("{\"error\":\" no data found.\"}");
			}
			return ResponseEntity.status(200).body(listEvent);
		}

		

}
