package org.owner.property.service;



import org.springframework.stereotype.Service;



import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.LoggerFactory;

import javax.transaction.Transactional;

import org.owner.property.model.Property;
import org.owner.property.pojo.PropertyPojo;
import org.owner.property.repository.PropertyRepo;
import org.slf4j.Logger;

@Service
public class PropertyService {
	private static Logger logger = LoggerFactory.getLogger(PropertyService.class);

	@Autowired
	private PropertyRepo propertyRepo;

	@Transactional
	public void saveUser(PropertyPojo propertyPojo) {
		Property property = new Property();

		try {

			property.setApartmentType(propertyPojo.getApartmentType());
			property.setApartmentName(propertyPojo.getApartmentName());
			property.setPropertyAge(propertyPojo.getPropertyAge());
			property.setFacing(propertyPojo.getFacing());
			property.setPropertySize(propertyPojo.getPropertySize());
			property.setBhkType(propertyPojo.getBhkType());
			property.setFloor(propertyPojo.getFloor());
			property.setTotalFloor(propertyPojo.getTotalFloor());
			property.setCity(propertyPojo.getCity());
			property.setLocality(propertyPojo.getLocality());
			property.setStreet(propertyPojo.getStreet());
			property.setExpectedRent(propertyPojo.getExpectedRent());
			property.setExpectedDeposit(propertyPojo.getExpectedDeposit());
			property.setMaintenance(propertyPojo.getMaintenance());
			property.setAvailabeFrom(propertyPojo.getAvailabeFrom());
			property.setPropertyFor(propertyPojo.getPropertyFor());

			property.setLift(propertyPojo.getLift());
			property.setInternet(propertyPojo.getInternet());
			property.setGym(propertyPojo.getGym());
			property.setAc(propertyPojo.getAc());
			property.setNegotiable(propertyPojo.getNegotiable());
			property.setPreferdTenants(propertyPojo.getPreferdTenants());
			property.setFurnishing(propertyPojo.getFurnishing());
			property.setParking(propertyPojo.getParking());
			property.setDescription(propertyPojo.getDescription());
			property.setBathroom(propertyPojo.getBathroom());
			property.setBalcony(propertyPojo.getBalcony());
			property.setWaterSupply(propertyPojo.getWaterSupply());
			property.setGyms(propertyPojo.getGyms());
			property.setNonVeg(propertyPojo.getNonVeg());
			property.setGatedSecurity(propertyPojo.getGatedSecurity());
			property.setWhoWillShowTheHouse(propertyPojo.getWhoWillShowTheHouse());
			property.setContactNo(propertyPojo.getContactNo());

			propertyRepo.save(property);

//        propertyRepo.save(property);

			logger.info("User details save successfully!!");

		} catch (Exception e) {
			logger.error("Failed in saving user details ", e);
		}

	}

}
