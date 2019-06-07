package net.eurreca.orc.service;

import org.springframework.mail.SimpleMailMessage;

import net.eurreca.orc.model.Reporter;

public interface EmailService {
	
	
	
	public void sendEmail(final Object object);
	
	/*
	void findUniqueId( Reporter reporter);
	
	void sendSimpleMessage(String to,
            String subject,
            String text);
void sendSimpleMessageUsingTemplate(String to,
                         String subject,
                         SimpleMailMessage template,
                         String ...templateArgs);
void sendMessageWithAttachment(String to,
                    String subject,
                    String text,
                    String pathToAttachment);

*/
}
