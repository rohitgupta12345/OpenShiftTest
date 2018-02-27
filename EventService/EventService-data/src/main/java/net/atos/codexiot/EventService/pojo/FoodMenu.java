package net.atos.codexiot.EventService.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="FoodMenu")
public class FoodMenu {

	@Id
	private int pkId;

	private String foodId;
	private String foodType;
	private String nutrionalInfo;
	private String specialContents;
	private String portion;
	private String foodName;
	private String description;
	private float cost;
	
	
	
	
	public FoodMenu() {
		super();
		
	}
	public int getPkId() {
		return pkId;
	}
	public void setPkId(int pkId) {
		this.pkId = pkId;
	}
	public String getFoodId() {
		return foodId;
	}
	public void setFoofId(String foofId) {
		this.foodId = foofId;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public String getNutrionalInfo() {
		return nutrionalInfo;
	}
	public void setNutrionalInfo(String nutrionalInfo) {
		this.nutrionalInfo = nutrionalInfo;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getSpecialContents() {
		return specialContents;
	}
	public void setSpecialContents(String specialContents) {
		this.specialContents = specialContents;
	}
	public String getPortion() {
		return portion;
	}
	public void setPortion(String portion) {
		this.portion = portion;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
