package net.eurreca.orc.dao;

import org.springframework.mail.SimpleMailMessage;

import net.eurreca.orc.model.Reporter;

public interface EmailDao {

	

	public void sendEmail(final Object object);

	/*
	 * void sendMessageWithAttachment(String to, String subject, String text, String
	 * pathToAttachment);
	 * 
	 * void sendBulkEmails(List<ErecReport> erecReports);
	 * 
	 * void sendEachEmail(ErecReport erecReport);
	 * 
	 

	void sendSimpleMessage(String to, String subject, String text);

	void sendSimpleMessageUsingTemplate(String to, String subject, SimpleMailMessage template, String... templateArgs);

	void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment);
	
*/
}
