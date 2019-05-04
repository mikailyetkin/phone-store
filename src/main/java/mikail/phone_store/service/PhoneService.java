package mikail.phone_store.service;

import java.util.List;

import mikail.phone_store.model.Phone;

public interface PhoneService {
	public List<Phone> getAllPhones();
	public List<Phone> getPhones(String brand);
}
