package org.owner.hostel.pojo;


import java.util.List;

public class HostelPojo {
	private long id;

	private List<String> room;
	private int expectedRent;
	private int expectedDeposit;
	private List<String> roomAmenities;
	private String city;
	private String locality;
	private String street;

	private String availableFrom;
	private String preferdGuest;
	private String food;
	private List<String> foodAvailable;
	private List<String> rules;
	private String closingTime;
	private String description;
	private String laundry;
	private String roomCleaning;
	private String wardenFacility;
	//private List<String> availableAmenities;
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

	public List<String> getRoom() {
		return room;
	}

	public void setRoom(List<String> room) {
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

	public List<String> getRoomAmenities() {
		return roomAmenities;
	}

	public void setRoomAmenities(List<String> roomAmenities) {
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

	public List<String> getFoodAvailable() {
		return foodAvailable;
	}

	public void setFoodAvailable(List<String> foodAvailable) {
		this.foodAvailable = foodAvailable;
	}

	public List<String> getRules() {
		return rules;
	}

	public void setRules(List<String> rules) {
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

//	public List<String> getAvailableAmenities() {
//		return availableAmenities;
//	}
//
//	public void setAvailableAmenities(List<String> availableAmenities) {
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

	@Override
	public String toString() {
		return "HostelPojo [id=" + id + ", room=" + room + ", expectedRent=" + expectedRent + ", expectedDeposit="
				+ expectedDeposit + ", roomAmenities=" + roomAmenities + ", city=" + city + ", locality=" + locality
				+ ", street=" + street + ", availableFrom=" + availableFrom + ", preferdGuest=" + preferdGuest
				+ ", food=" + food + ", foodAvailable=" + foodAvailable + ", rules=" + rules + ", closingTime="
				+ closingTime + ", description=" + description + ", laundry=" + laundry + ", roomCleaning="
				+ roomCleaning + ", wardenFacility=" + wardenFacility + ", parking=" + parking + ", lift=" + lift
				+ ", wifi=" + wifi + ", powerBackup=" + powerBackup + ", tv=" + tv + ", mess=" + mess + ", cooking="
				+ cooking + ", refrigerator=" + refrigerator + "]";
	}

	
	

}

