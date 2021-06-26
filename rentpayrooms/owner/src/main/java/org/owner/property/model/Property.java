package org.owner.property.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
@Entity
@Table(name = "property")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private long id;
	
	@Column(name = "apartment_type")
	private String apartmentType;
	@Column(name = "apartment_name")
	private String apartmentName;
	@Column(name = "property_age")
	private String propertyAge;
	@Column(name = "facing")
	private String facing;
	@Column(name = "property_size")
	private String propertySize;
	@Column(name = "bhk_type")
	private String bhkType;
	@Column(name = "floor")
	private String floor;
	@Column(name = "total_floor")
	private String totalFloor;
	@Column(name = "city")
	private String city;
	@Column(name = "locality")
	private String locality;
	@Column(name = "street")
	private String street;
	private long expectedRent;
	private long expectedDeposit;
	private String maintenance;
	private String availabeFrom;
	private String preferdTenants;
	private String furnishing;
	private String parking;
	private String description;
	private int bathroom;
	private int balcony;
	private String waterSupply;
	private String gyms;
	private String nonVeg;
	private String negotiable;
	private String propertyFor;
	//private String amenity;
	private String gatedSecurity;
	private String whoWillShowTheHouse;
	private long contactNo;
	private String gym;
	private String internet;
	private String ac;
	private String lift;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getApartmentType() {
		return apartmentType;
	}
	public void setApartmentType(String apartmentType) {
		this.apartmentType = apartmentType;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public String getPropertyAge() {
		return propertyAge;
	}
	public void setPropertyAge(String propertyAge) {
		this.propertyAge = propertyAge;
	}
	public String getFacing() {
		return facing;
	}
	public void setFacing(String facing) {
		this.facing = facing;
	}
	public String getPropertySize() {
		return propertySize;
	}
	public void setPropertySize(String propertySize) {
		this.propertySize = propertySize;
	}
	public String getBhkType() {
		return bhkType;
	}
	public void setBhkType(String bhkType) {
		this.bhkType = bhkType;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getTotalFloor() {
		return totalFloor;
	}
	public void setTotalFloor(String totalFloor) {
		this.totalFloor = totalFloor;
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
	public long getExpectedRent() {
		return expectedRent;
	}
	public void setExpectedRent(long expectedRent) {
		this.expectedRent = expectedRent;
	}
	public long getExpectedDeposit() {
		return expectedDeposit;
	}
	public void setExpectedDeposit(long expectedDeposit) {
		this.expectedDeposit = expectedDeposit;
	}
	public String getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}
	public String getAvailabeFrom() {
		return availabeFrom;
	}
	public void setAvailabeFrom(String availabeFrom) {
		this.availabeFrom = availabeFrom;
	}
	public String getPreferdTenants() {
		return preferdTenants;
	}
	public void setPreferdTenants(String preferdTenants) {
		this.preferdTenants = preferdTenants;
	}
	public String getFurnishing() {
		return furnishing;
	}
	public void setFurnishing(String furnishing) {
		this.furnishing = furnishing;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getBathroom() {
		return bathroom;
	}
	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}
	public int getBalcony() {
		return balcony;
	}
	public void setBalcony(int balcony) {
		this.balcony = balcony;
	}
	public String getWaterSupply() {
		return waterSupply;
	}
	public void setWaterSupply(String waterSupply) {
		this.waterSupply = waterSupply;
	}
	public String getGyms() {
		return gyms;
	}
	public void setGyms(String gyms) {
		this.gyms = gyms;
	}
	public String getNonVeg() {
		return nonVeg;
	}
	public void setNonVeg(String nonVeg) {
		this.nonVeg = nonVeg;
	}
	public String getNegotiable() {
		return negotiable;
	}
	public void setNegotiable(String negotiable) {
		this.negotiable = negotiable;
	}
	public String getPropertyFor() {
		return propertyFor;
	}
	public void setPropertyFor(String propertyFor) {
		this.propertyFor = propertyFor;
	}
//	public String getAmenity() {
//		return amenity;
//	}
//	public void setAmenity(String amenity) {
//		this.amenity = amenity;
//	}
	public String getGatedSecurity() {
		return gatedSecurity;
	}
	public void setGatedSecurity(String gatedSecurity) {
		this.gatedSecurity = gatedSecurity;
	}
	public String getWhoWillShowTheHouse() {
		return whoWillShowTheHouse;
	}
	public void setWhoWillShowTheHouse(String whoWillShowTheHouse) {
		this.whoWillShowTheHouse = whoWillShowTheHouse;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	public String getGym() {
		return gym;
	}
	public void setGym(String gym) {
		this.gym = gym;
	}
	public String getInternet() {
		return internet;
	}
	public void setInternet(String internet) {
		this.internet = internet;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getLift() {
		return lift;
	}
	public void setLift(String lift) {
		this.lift = lift;
	}
	public Property()
	{
		
	}
	public Property(long id, String apartmentType, String apartmentName, String propertyAge, String facing,
			String propertySize, String bhkType, String floor, String totalFloor, String city, String locality,
			String street, long expectedRent, long expectedDeposit, String maintenance, String availabeFrom,
			String preferdTenants, String furnishing, String parking, String description, int bathroom, int balcony,
			String waterSupply, String gyms, String nonVeg, String negotiable, String propertyFor, String gatedSecurity,
			String whoWillShowTheHouse, long contactNo, String gym, String internet, String ac, String lift) {
		super();
		this.id = id;
		this.apartmentType = apartmentType;
		this.apartmentName = apartmentName;
		this.propertyAge = propertyAge;
		this.facing = facing;
		this.propertySize = propertySize;
		this.bhkType = bhkType;
		this.floor = floor;
		this.totalFloor = totalFloor;
		this.city = city;
		this.locality = locality;
		this.street = street;
		this.expectedRent = expectedRent;
		this.expectedDeposit = expectedDeposit;
		this.maintenance = maintenance;
		this.availabeFrom = availabeFrom;
		this.preferdTenants = preferdTenants;
		this.furnishing = furnishing;
		this.parking = parking;
		this.description = description;
		this.bathroom = bathroom;
		this.balcony = balcony;
		this.waterSupply = waterSupply;
		this.gyms = gyms;
		this.nonVeg = nonVeg;
		this.negotiable = negotiable;
		this.propertyFor = propertyFor;
		this.gatedSecurity = gatedSecurity;
		this.whoWillShowTheHouse = whoWillShowTheHouse;
		this.contactNo = contactNo;
		this.gym = gym;
		this.internet = internet;
		this.ac = ac;
		this.lift = lift;
	}
	

}
