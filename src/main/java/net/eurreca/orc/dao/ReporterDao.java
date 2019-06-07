package net.eurreca.orc.dao;

import java.util.List;

import net.eurreca.orc.model.Reporter;

public interface ReporterDao {
	
	Reporter findById(int id);
	Reporter findByEmail(String email);
	void save( Reporter reporter);
	void deleteByEmail( String email);
	List<Reporter> findAllRepporter();
	void sendUniqueId(int id);
}
