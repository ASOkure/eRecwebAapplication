package net.eurreca.orc.service;

import java.util.List;

import net.eurreca.orc.model.Reporter;

public interface ReporterService {
	
	
	Reporter findById(int id);
	Reporter findByEmail(String email);
	void save( Reporter reporter);
	void updateReporter( Reporter reporter);
	void deleteByEmail( String email);
	List<Reporter> findAllRepporter();
	void sendUniqueId(int id);

}
