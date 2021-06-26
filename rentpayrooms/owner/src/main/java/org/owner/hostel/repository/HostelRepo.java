package org.owner.hostel.repository;

import java.util.List;

import org.owner.hostel.model.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HostelRepo extends JpaRepository<Hostel, Long>{
	List<Hostel> findAll();
	Hostel findById(long id);

}