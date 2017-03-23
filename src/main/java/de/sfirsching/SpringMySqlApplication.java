package de.sfirsching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.sql.DataSource;

@SpringBootApplication
public class SpringMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMySqlApplication.class, args);
	}
}
