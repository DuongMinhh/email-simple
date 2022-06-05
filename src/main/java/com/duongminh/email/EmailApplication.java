package com.duongminh.email;

import com.duongminh.email.service.email.EmailService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;

@Log4j2
@SpringBootApplication
public class EmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}

	@Autowired
	private EmailService emailService;
	@Autowired
	private Environment env;

	@EventListener(ApplicationReadyEvent.class)
	public void afterStartup() {
		log.info("============================");
		log.info("App Started");
		log.info("Port: " + env.getProperty("server.port"));
		log.info("============================");
	}
}