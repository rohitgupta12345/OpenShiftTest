package net.atos.codexiot.EventService.pojo;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="bookingdetails")
public class BookingDetails implements Serializable{
	@Id
	public int refNo;
	public String bookingNo;
	public String source;
	public String dest;
	public String airlineName;
	public String flightNo;
	public String travelClass;
	public String seatNo;
	public String name;
	public int age;
	public String gender;




	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getBookingNo() {
		return bookingNo;
	}


	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}


	public String getSource() {
		return source;
	}




	public void setSource(String source) {
		this.source = source;
	}




	public String getDest() {
		return dest;
	}




	public void setDest(String dest) {
		this.dest = dest;
	}




	public String getAirlineName() {
		return airlineName;
	}




	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}




	public String getFlightNo() {
		return flightNo;
	}




	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}




	public String getTravelClass() {
		return travelClass;
	}




	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}




	public String getSeatNo() {
		return seatNo;
	}




	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}









	public int getRefNo() {
		return refNo;
	}









	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}









	public String getName() {
		return name;
	}









	public void setName(String name) {
		this.name = name;
	}









	public int getAge() {
		return age;
	}









	public void setAge(int age) {
		this.age = age;
	}









	public String getGender() {
		return gender;
	}









	public void setGender(String gender) {
		this.gender = gender;
	}




	
	

}
