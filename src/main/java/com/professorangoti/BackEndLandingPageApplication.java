package com.professorangoti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackEndLandingPageApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackEndLandingPageApplication.class, args);
	}

	@Value("${SPRING_DATASOURCE_USERNAME}")
	private String SPRING_DATASOURCE_USERNAME;
	@Value("${SPRING_DATASOURCE_URL}")
	private String SPRING_DATASOURCE_URL;
	@Value("${SPRING_DATASOURCE_PASSWORD}")
	private String SPRING_DATASOURCE_PASSWORD;
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void run(String... strings) throws Exception {
		logger.info("------------> SPRING_DATASOURCE_URL: ", SPRING_DATASOURCE_URL);
		logger.info("------------> SPRING_DATASOURCE_USERNAME: ", SPRING_DATASOURCE_USERNAME);
		logger.info("------------> SPRING_DATASOURCE_PASSWORD: ", SPRING_DATASOURCE_PASSWORD);
	}

}
