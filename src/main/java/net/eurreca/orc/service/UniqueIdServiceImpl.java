package net.eurreca.orc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.eurreca.orc.model.UniqueId;

@Service("uniqueIdService")
public class  UniqueIdServiceImpl implements UniqueIdService{
	

	@Autowired
	EmailService emailService;

	@Override
	public void sendUniqueId(UniqueId uniqueid) {
		
		emailService.sendEmail(uniqueid);
		
	}
	
	
	
}