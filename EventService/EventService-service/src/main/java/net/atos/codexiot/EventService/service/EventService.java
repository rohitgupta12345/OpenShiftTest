package net.atos.codexiot.EventService.service;

import java.util.List;

import net.atos.codexiot.EventService.model.EventModels;
import net.atos.codexiot.EventService.model.IOTEventStatusModel;
import net.atos.codexiot.EventService.pojo.BookingDetails;
import net.atos.codexiot.EventService.pojo.Event;







/**
 * @author a622890
 *
 */
public interface EventService {

/*	*//**
	 * @return
	 *//*
	List<Event> getallevent();

	*//**
	 * @param status
	 * @return
	 *//*
	List<Event> geteventbystatus(String status);

	*//**
	 * @param iotevent
	 * @return
	 *//*
	boolean updateEventByEventId(IOTEventStatusModel iotevent);

	*//**
	 * @param customerId
	 * @return
	 *//*
	List<EventModels> getallEventbyCustomerID(long customerId);

	*//**
	 * @param customerId
	 * @return
	 *//*
	public int noOfEventsByCustomerId(long customerId);

	*//**
	 * @param eventStatusModels
	 *//*
	public void updateAllEventStatus(List<IOTEventStatusModel> eventStatusModels);*/

	BookingDetails getBookingDetailsService(String bookingId);

}
