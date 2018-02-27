package net.atos.codexiot.EventService.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userRecommendation")

public class UserRecommendation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ur_id")
	private long ur_id;
	
	@Column(name="ur_customer_id")
	private String ur_customer_id;
	
	@Column(name="ur_food_id")
	private String ur_food_id;
	
	@Column(name="ur_misc_id")
	private String ur_misc_id;

	public long getUr_id() {
		return ur_id;
	}

	public void setUr_id(long ur_id) {
		this.ur_id = ur_id;
	}

	public String getUr_customer_id() {
		return ur_customer_id;
	}

	public void setUr_customer_id(String ur_customer_id) {
		this.ur_customer_id = ur_customer_id;
	}

	public String getUr_food_id() {
		return ur_food_id;
	}

	public void setUr_food_id(String ur_food_id) {
		this.ur_food_id = ur_food_id;
	}

	public String getUr_misc_id() {
		return ur_misc_id;
	}

	public void setUr_misc_id(String ur_misc_id) {
		this.ur_misc_id = ur_misc_id;
	}
	 
	

}
