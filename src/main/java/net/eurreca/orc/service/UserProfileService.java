package net.eurreca.orc.service;

import java.util.List;

import net.eurreca.orc.model.UserProfile;




public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
