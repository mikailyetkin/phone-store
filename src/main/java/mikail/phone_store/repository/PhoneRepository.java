package mikail.phone_store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mikail.phone_store.model.Phone;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Integer> {
	
}
