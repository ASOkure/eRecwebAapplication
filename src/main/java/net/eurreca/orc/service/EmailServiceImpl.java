package net.eurreca.orc.service;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;

import net.eurreca.orc.model.UniqueId;


@Service("emailService")
@Transactional
public class EmailServiceImpl implements EmailService{
	

		@Autowired
		public JavaMailSender mailSender;
	 	
		//@Autowired
	    //private VelocityEngine velocityEngine;
		
		@Autowired
		Configuration freemarkerConfiguration;
	   
	 
		@Override
		public void sendEmail(Object object) {

			UniqueId uniqueid = (UniqueId)object;
			
			MimeMessagePreparator preparator = getMessagePreparator(uniqueid);
			
			try {
	            mailSender.send(preparator);
	            System.out.println("Message has been sent.............................");
	        }
	        catch (MailException ex) {
	            System.err.println(ex.getMessage());
	        }
		}

		private MimeMessagePreparator getMessagePreparator(final UniqueId uniqueid){
			
			MimeMessagePreparator preparator = new MimeMessagePreparator() {

				public void prepare(MimeMessage mimeMessage) throws Exception {
	            	MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
	 
	               	helper.setSubject("eREC UniqueId");
	               	helper.setFrom("akan.okure@gmail.com");
	               //	helper.setTo(order.getCustomerInfo().getEmail());
	               	helper.setTo(uniqueid.getReporter().getEmail());
	     
	               	Map<String, Object> model = new HashMap<String, Object>();
	                model.put("uniqueid", uniqueid);
	                
	            	String text = geFreeMarkerTemplateContent(model);
	                System.out.println("Template content : "+text);

	                // use the true flag to indicate you need a multipart message
	            	helper.setText(text, true);

	            	//Additionally, let's add a resource as an attachment as well.
	            	//helper.addAttachment("cutie.png", new ClassPathResource("linux-icon.png"));

	            }
	        };
	        return preparator;
		}
		
		/*
		public String geVelocityTemplateContent(Map<String, Object> model){
			StringBuffer content = new StringBuffer();
			try{
				content.append(VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "/vmtemplates/velocity_mailTemplate.vm", model));
				return content.toString();
			}catch(Exception e){
				System.out.println("Exception occured while processing velocity template:"+e.getMessage());
			}
		      return "";
		}
	    
	    */
	  
		
		public String geFreeMarkerTemplateContent(Map<String, Object> model){
			StringBuffer content = new StringBuffer();
			try{
	         content.append(FreeMarkerTemplateUtils.processTemplateIntoString( 
	        		 freemarkerConfiguration.getTemplate("fm_mailTemplate.txt"),model));
	         return content.toString();
			}catch(Exception e){
				System.out.println("Exception occured while processing fmtemplate:"+e.getMessage());
			}
		      return "";
		}

		
		
}











































	


