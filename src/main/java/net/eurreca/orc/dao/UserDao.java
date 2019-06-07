package net.eurreca.orc.dao;

import java.util.List;

import net.eurreca.orc.model.User;

public interface UserDao {
	
	

    User findById(int id);
     
    User findBySSO(String sso);
     
    void save(User user);
     
    void deleteBySSO(String sso);
     
    List<User> findAllUsers();

}
