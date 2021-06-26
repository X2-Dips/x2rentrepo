package org.owner.hostel.service;



import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import org.owner.hostel.model.Hostel;
import org.owner.hostel.pojo.HostelPojo;
import org.owner.hostel.repository.HostelRepo;
import org.slf4j.Logger;

@Service
public class HostelService {
	private static Logger logger = LoggerFactory.getLogger(HostelService.class);

	@Autowired
	private HostelRepo hostelRepo;

	public void saveHostel(HostelPojo hostelPojo) {

		Hostel hostel = new Hostel();
		try {

			StringBuilder room = new StringBuilder();
			for (String s : hostelPojo.getRoom()) {
				room.append(s);
				room.append(",");
			}
			
			
			StringBuilder foodAvailable = new StringBuilder();
			for (String q : hostelPojo.getFoodAvailable()) {
				foodAvailable.append(q);
				foodAvailable.append(",");
			}
			
			StringBuilder rules = new StringBuilder();
			for (String r : hostelPojo.getRules()) {
				rules.append(r);
				rules.append(",");
			}
			
			StringBuilder roomAmenities = new StringBuilder();
			for (String t : hostelPojo.getRoomAmenities()) {
				roomAmenities.append(t);
				roomAmenities.append(",");
			}

			hostel.setRoom(room.toString());
			hostel.setExpectedRent(hostelPojo.getExpectedRent());
			hostel.setExpectedDeposit(hostelPojo.getExpectedDeposit());
			hostel.setRoomAmenities(roomAmenities.toString());
			hostel.setCity(hostelPojo.getCity());
			hostel.setLocality(hostelPojo.getLocality());
			hostel.setStreet(hostelPojo.getStreet());

			hostel.setAvailableFrom(hostelPojo.getAvailableFrom());
			hostel.setPreferdGuest(hostelPojo.getPreferdGuest());
			hostel.setFood(hostelPojo.getFood());
			hostel.setFoodAvailable(foodAvailable.toString());
			hostel.setRules(rules.toString());
			hostel.setClosingTime(hostelPojo.getClosingTime());
			hostel.setDescription(hostelPojo.getDescription());
			hostel.setLaundry(hostelPojo.getLaundry());
			hostel.setRoomCleaning(hostelPojo.getRoomCleaning());
			hostel.setWardenFacility(hostelPojo.getWardenFacility());
			hostel.setParking(hostelPojo.getParking());
			hostel.setLift(hostelPojo.getLift());
			hostel.setTv(hostelPojo.getTv());
			hostel.setWifi(hostelPojo.getWifi());
			hostel.setMess(hostelPojo.getMess());
			hostel.setCooking(hostelPojo.getCooking());
			hostel.setRefrigerator(hostelPojo.getRefrigerator());
			hostel.setPowerBackup(hostelPojo.getPowerBackup());
			

			hostelRepo.save(hostel);

			logger.info("User details save successfully!!");

		} catch (Exception e) {
			logger.error("Failed in saving user details ", e);
		}

	}

}

