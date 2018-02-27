package net.atos.codexiot.EventService.model;

public class BookingDetailsModel {
	public long bookingId;
	public String source;
	public String dest;
	public String airlineName;
	public String userName;
	public int age;
	public String country;
	public String gender;

	
	public BookingDetailsModel() {
		super();
	}


	public long getBookingId() {
		return bookingId;
	}


	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	

	
	
	
}
