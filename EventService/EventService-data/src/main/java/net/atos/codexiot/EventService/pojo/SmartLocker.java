package net.atos.codexiot.EventService.pojo;
	import java.util.Date;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.NamedQuery;
	import javax.persistence.Table;




	/**
	 * @author a622693
	 *
	 */


	@Entity
	@Table(name="smartLock")
	//@NamedQuery(name="smartLock.findAll", query="select s from smartLock ")
	public class SmartLocker {
		
		//private static final long serialVersionUID = 2L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="locker_Id")	
	private long locker_Id;

	@Column(name ="capacity")
	private String capacity;

	@Column(name ="cost")
	private String cost;

	

	@Column(name ="status")
	private String  status;

	public long getLocker_Id() {
		return locker_Id;
	}

	public void setLocker_Id(long locker_Id) {
		this.locker_Id = locker_Id;
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



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}




	}


