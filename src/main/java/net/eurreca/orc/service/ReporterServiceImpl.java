package net.eurreca.orc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.eurreca.orc.dao.ReporterDao;
import net.eurreca.orc.model.Reporter;

@Service("reporterService")
@Transactional
public class ReporterServiceImpl implements ReporterService {

	@Autowired
	private ReporterDao dao;
	
	
	public Reporter findById(int id) {
		
		
		return dao.findById(id);
	}

	
	public Reporter findByEmail(String email) {
		
		return dao.findByEmail(email);
	}

	
	public void save(Reporter reporter) {
		
		reporter.getFirstName();
		dao.save(reporter);
		
	}
	
	
	/*
     * Since the method is running with Transaction, No need to call hibernate update explicitly.
     * Just fetch the entity from db and update it with proper values within transaction.
     * It will be updated in db once transaction ends. 
     */

	public void updateReporter(Reporter reporter) {
		
		Reporter entity = dao.findById(reporter.getId());
		
		if ( entity != null) {
			entity.setId(reporter.getId());
			entity.setFirstName(reporter.getFirstName());
			entity.setLastName(reporter.getLastName());
			entity.setEmail(reporter.getEmail());
		}	
	}

	
	public void deleteByEmail(String email) {
		dao.deleteByEmail(email);
		
	}


	public List<Reporter> findAllRepporter() {
		
		return dao.findAllRepporter();
	}

	@Override
	public void sendUniqueId(int id) {
		// TODO Auto-generated method stub
		
	}

}
