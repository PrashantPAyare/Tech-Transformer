package com.pearsonVue.PearsonVue;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class ExtraConfig {
	@Value("${spring.mail.username}")
	private String userName;
	@Value("${spring.mail.password}")
	private String passWord;
	@Value("${spring.mail.host}")
	private String host;
	@Value("#{T(java.lang.Integer).parseInt(${spring.mail.port})}")
	private int port;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(getHost());
		mailSender.setPort(getPort());
		mailSender.setUsername(getUserName());
		mailSender.setPassword(getPassWord());
		mailSender.setJavaMailProperties(getMailProperties());
		return mailSender;
	}

	private Properties getMailProperties() {
		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");
		return props;
	}

}
