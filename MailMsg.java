package com.pearsonVue.PearsonVue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MailMsg {
	@Value("${spring.mail.username}")
	String from;
	@Value("${spring.mail.password}")
	String to;
	String subject;
	String emailBody;

	public MailMsg(){
		
	}
	
	public MailMsg(String from, String to, String subject, String emailBody) {
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.emailBody = emailBody;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}
}
