package net.atos.codexiot.EventService.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.atos.codexiot.EventService.model.BookingDetailsModel;
import net.atos.codexiot.EventService.model.EventModels;
import net.atos.codexiot.EventService.model.IOTEventStatusModel;
import net.atos.codexiot.EventService.pojo.BookingDetails;
import net.atos.codexiot.EventService.pojo.Event;
import net.atos.codexiot.EventService.service.EventService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author a622693
 *
 */

@RestController
@EnableSwagger2
@Api(value = "Event")
@RequestMapping(value = "/Event", produces = "application/json")
public class EventController {
	
	// Apache logger
			private static final Logger logger = Logger
					.getLogger(EventController.class);
			// UserService Interface Reference
	
	@Autowired
	EventService evs;
	

	
	@SuppressWarnings("rawtypes")
	@CrossOrigin
	@RequestMapping(value = "/getBookingDetails/{bookingId}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Getting Booking Details ", notes = "", response = Event.class)
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Event are fetched."),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 404, message = "No  data found"),
			@ApiResponse(code = 400, message = "Bad request! Required field missing"),
			@ApiResponse(code = 409, message = "Search results not found.") })
	@ResponseBody
	public ResponseEntity getBookingDetails(
			@ApiParam(value = "bookingId", required = true) @PathVariable("bookingId")  String bookingId) {	
		BookingDetailsModel bdm=new BookingDetailsModel();
		
		
		BookingDetails bd=evs.getBookingDetailsService(bookingId);
		
		
		
		return ResponseEntity.status(200).body(bd); 
	
	}
	
	
	/*
	@SuppressWarnings("rawtypes")
	@CrossOrigin
	@RequestMapping(value = "/getBookingDetailsNdc/{bookingId}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Getting Booking Details ", notes = "", response = Event.class)
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Event are fetched."),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 404, message = "No  data found"),
			@ApiResponse(code = 400, message = "Bad request! Required field missing"),
			@ApiResponse(code = 409, message = "Search results not found.") })
	@ResponseBody
	public ResponseEntity getBookingDetailsNdc(
			@ApiParam(value = "bookingId", required = true) @PathVariable("bookingId")  String bookingId) {	
	
	//	BookingDetailsModel bdm=new BookingDetailsModel();
	    BookingDetails bd=evs.getBookingDetailsService(bookingId);
	//	RestTemplate rt=new RestTemplate();
		
	    OkHttpClient client = new OkHttpClient();

	    MediaType mediaType = MediaType.parse("application/atom+xml");
	    RequestBody body = RequestBody.create(mediaType, "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:edis=\"http://www.iata.org/IATA/EDIST\">\r\n\r\n   <soapenv:Header/>\r\n\r\n   <soapenv:Body>\r\n\r\n      <edis:OrderRetrieveRQ>\r\n\r\n        <edis:Document>\r\n\r\n            <edis:Name>NDC</edis:Name>\r\n\r\n      <edis:ReferenceVersion>15.2</edis:ReferenceVersion>\r\n\r\n         </edis:Document>\r\n\r\n         <edis:Party>\r\n\r\n            <edis:Sender>\r\n\r\n               <edis:AgentUserSender>\r\n\r\n                  <edis:AgentUserID>HKTHONUSR</edis:AgentUserID>\r\n\r\n               </edis:AgentUserSender>\r\n\r\n            </edis:Sender>\r\n\r\n            <edis:Recipient>\r\n\r\n               <edis:ORA_Recipient>\r\n\r\n                  <edis:AirlineID>XQ</edis:AirlineID>\r\n\r\n                  <edis:Name>SunExpress</edis:Name>\r\n\r\n               </edis:ORA_Recipient>\r\n\r\n            </edis:Recipient>\r\n\r\n         </edis:Party>\r\n\r\n         <edis:Query>\r\n\r\n            <edis:Filters>\r\n\r\n               <edis:OrderID Owner=\"XQ\">J2D4Q2</edis:OrderID>\r\n\r\n            </edis:Filters>\r\n\r\n         </edis:Query>\r\n\r\n      </edis:OrderRetrieveRQ>\r\n\r\n   </soapenv:Body>\r\n\r\n</soapenv:Envelope>");
	    Request request = new Request.Builder()
	      .url("https://iflyrestest.ibsgen.com:6013/iRes_NdcRes_WS/services/NdcResServiceSOAPPort?wsdl=")
	      .post(body)
	      .addHeader("content-type", "application/atom+xml")
	      .addHeader("username", "HKTHONUSR")
	      .addHeader("password", "12345")
	      .addHeader("cache-control", "no-cache")
	      .addHeader("postman-token", "c685c32c-cb44-a52a-5b4b-911ed5c492ff")
	      .build();

	    Response response = client.newCall(request).execute();
	    
		return ResponseEntity.status(200).body(bd);
	
	}	
	
	
	*/ 
	
}   
