package org.owner.hostel.controller;


import java.util.List;

import org.owner.hostel.model.Hostel;
import org.owner.hostel.pojo.HostelPojo;
import org.owner.hostel.repository.HostelRepo;
import org.owner.hostel.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;


@CrossOrigin
@RestController
@RequestMapping("api/")
public class HostelController {
	@Autowired

	private HostelService hostelService;
	@Autowired
	private HostelRepo repo;

	@PostMapping(value = "/postHostel", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String PostProperty(@RequestBody HostelPojo hostelPojo) {
		System.err.println(hostelPojo);
		hostelService.saveHostel(hostelPojo);
		return "success";
	}

	@GetMapping("/getHostel")
	public List<Hostel> getAllNotes() {
		return repo.findAll();
	}

	@GetMapping(value = "/getHostel/{id}")
	public Hostel getHostelById(@PathVariable(value = "id") String id) {
		long hostelId=Long.parseLong(id);
		return repo.findById(hostelId);
	}

}
