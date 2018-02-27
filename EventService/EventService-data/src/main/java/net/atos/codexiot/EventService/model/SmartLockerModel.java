package net.atos.codexiot.EventService.model;





public class SmartLockerModel {	
	private long lockerId;


	private String capacity;


	private String cost;


	private String rent;
	private String status;

	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public long getLockerId() {
		return lockerId;
	}


	public void setLockerId(long lockerId) {
		this.lockerId = lockerId;
	}


	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public String getCost() {
		return cost;
	}


	public void setCost(String cost) {
		this.cost = cost;
	}


	public String getRent() {
		return rent;
	}


	public void setRent(String rent) {
		this.rent = rent;
	}







}
