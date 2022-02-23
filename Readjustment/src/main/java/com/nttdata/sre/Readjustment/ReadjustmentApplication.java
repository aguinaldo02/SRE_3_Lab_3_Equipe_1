package com.nttdata.sre.Readjustment;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class ReadjustmentApplication {
	private static final Logger logger = LoggerFactory.getLogger(ReadjustmentApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ReadjustmentApplication.class, args);
		logger.info("Application " + ctx.getApplicationName() + " started");

	}

}
