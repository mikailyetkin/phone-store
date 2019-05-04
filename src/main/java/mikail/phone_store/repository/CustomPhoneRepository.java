package mikail.phone_store.repository;

import java.util.List;

import mikail.phone_store.model.Phone;

public interface CustomPhoneRepository {
	
	List<Phone> getNamesLikeOrBrandLike(String name);
	
}
