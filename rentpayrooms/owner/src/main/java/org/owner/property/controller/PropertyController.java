package org.owner.property.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.owner.property.model.Property;
import org.owner.property.pojo.PropertyPojo;
import org.owner.property.repository.PropertyRepo;
import org.owner.property.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
@CrossOrigin
@RestController
@RequestMapping("api/")
public class PropertyController {
	@Autowired
	private PropertyService propertyService;  
	@Autowired
	private PropertyRepo repo;
	 @PostMapping(value="/postProperty" , consumes = MediaType.APPLICATION_JSON_VALUE)
	    public String PostProperty(@RequestBody PropertyPojo propertyPojo) {
	    	propertyService.saveUser(propertyPojo);
	    	return "success";
	    

	    }
	    @GetMapping("/getProperty")
		public List<Property> getAllNotes() {
			return repo.findAll();
		}

		@GetMapping(value = "/getProperty/{id}")
		public Property getPropertyById(@PathVariable(value = "id") String id) {
			long propertyId=Long.parseLong(id);
			return repo.findById(propertyId);
		}
}
