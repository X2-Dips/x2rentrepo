package org.owner.property.repository;

import java.util.List;

import org.owner.property.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PropertyRepo extends JpaRepository<Property, Long>{
	List<Property> findAll();
	Property findById(long id);

}
