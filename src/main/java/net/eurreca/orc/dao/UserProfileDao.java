package net.eurreca.orc.dao;

import java.util.List;

import net.eurreca.orc.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
