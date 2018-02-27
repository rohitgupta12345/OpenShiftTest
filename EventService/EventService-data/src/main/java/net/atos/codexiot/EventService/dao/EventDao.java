package net.atos.codexiot.EventService.dao;

import java.util.List;

import net.atos.codexiot.EventService.pojo.BookingDetails;
import net.atos.codexiot.EventService.pojo.Event;



/**
 * @author a622890
 *
 */
public interface EventDao {

/*	*//**
	 * @return
	 *//*
	List<Event> getEventDescriptions();

	*//**
	 * @return
	 *//*
	List<Event> getallevent();

	*//**
	 * @param status
	 * @return
	 *//*
	List<Event> geteventbystatus(String status);

	*//**
	 * @param eventId
	 * @return
	 *//*
	Event getEventByEventId(long eventId);

	*//**
	 * @param event
	 * @return
	 *//*
	boolean updateEventStatus(Event event);

	*//**
	 * @param customerId
	 * @return
	 *//*
	List<Event> getallEventbyCustomerID(long customerId);

	*//**
	 * @param customerId
	 * @return
	 *//*
	public int noOfEventsByCustomerId(long customerId);*/

	BookingDetails getBookingDetails(String bookingId);
}
