package org.owner.hostel.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "hostel")
public class Hostel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String room;
	private int expectedRent;
	private int expectedDeposit;
	private String roomAmenities;
	private String city;
	private String locality;
	private String street;
	
	private String availableFrom;
	private String preferdGuest;
	private String food;
	private String foodAvailable;
	private String rules;
	private String closingTime;
	private String description;
	private String laundry;
	private String roomCleaning;
	private String wardenFacility;
	//private String availableAmenities;
	private String parking;
	private String lift;
	private String wifi;
	private String powerBackup;
	private String tv;
	private String mess;
	private String cooking;
	private String refrigerator;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getExpectedRent() {
		return expectedRent;
	}

	public void setExpectedRent(int expectedRent) {
		this.expectedRent = expectedRent;
	}

	public int getExpectedDeposit() {
		return expectedDeposit;
	}

	public void setExpectedDeposit(int expectedDeposit) {
		this.expectedDeposit = expectedDeposit;
	}

	public String getRoomAmenities() {
		return roomAmenities;
	}

	public void setRoomAmenities(String roomAmenities) {
		this.roomAmenities = roomAmenities;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	
	

	public String getAvailableFrom() {
		return availableFrom;
	}

	public void setAvailableFrom(String availableFrom) {
		this.availableFrom = availableFrom;
	}

	public String getPreferdGuest() {
		return preferdGuest;
	}

	public void setPreferdGuest(String preferdGuest) {
		this.preferdGuest = preferdGuest;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getFoodAvailable() {
		return foodAvailable;
	}

	public void setFoodAvailable(String foodAvailable) {
		this.foodAvailable = foodAvailable;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLaundry() {
		return laundry;
	}

	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}

	public String getRoomCleaning() {
		return roomCleaning;
	}

	public void setRoomCleaning(String roomCleaning) {
		this.roomCleaning = roomCleaning;
	}

	public String getWardenFacility() {
		return wardenFacility;
	}

	public void setWardenFacility(String wardenFacility) {
		this.wardenFacility = wardenFacility;
	}

//	public String getAvailableAmenities() {
//		return availableAmenities;
//	}
//
//	public void setAvailableAmenities(String availableAmenities) {
//		this.availableAmenities = availableAmenities;
//	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}
	

	public String getLift() {
		return lift;
	}

	public void setLift(String lift) {
		this.lift = lift;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getPowerBackup() {
		return powerBackup;
	}

	public void setPowerBackup(String powerBackup) {
		this.powerBackup = powerBackup;
	}

	public String getTv() {
		return tv;
	}

	public void setTv(String tv) {
		this.tv = tv;
	}

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public String getCooking() {
		return cooking;
	}

	public void setCooking(String cooking) {
		this.cooking = cooking;
	}

	public String getRefrigerator() {
		return refrigerator;
	}

	public void setRefrigerator(String refrigerator) {
		this.refrigerator = refrigerator;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Hostel() {

	}
}
