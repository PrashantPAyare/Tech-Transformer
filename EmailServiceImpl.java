package com.pearsonVue.PearsonVue;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailServiceImpl{
	@Autowired
	JavaMailSender emailSender;
	
	@Autowired
	private ExtraConfig config;
	
	@PostMapping(path="verify")
	@ResponseBody
    public String sendSimpleMessage(@ModelAttribute("mailMessage") MailMsg mailMessage) throws MessagingException {
		
		emailSender = config.getJavaMailSender();
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		System.out.println("Sending..."+config.getHost());
		
		message.setTo(mailMessage.getTo()); 
		System.out.println("Sending..."+mailMessage.getTo());
		message.setSubject(mailMessage.getSubject()); 
		message.setText(mailMessage.getEmailBody());
		
		emailSender.send(message);
		return "Sent Successfully...!!!";     
    }
        
}
