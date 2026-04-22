package fr.nirahtech.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DevopsDemoApplication {

	public static void main(String[] args) {
		final String loggerLevel = System.getenv("LOGGER_LEVEL");
		System.out.println(loggerLevel);
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

}
