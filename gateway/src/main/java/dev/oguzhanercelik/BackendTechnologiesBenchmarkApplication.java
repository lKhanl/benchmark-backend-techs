package dev.oguzhanercelik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BackendTechnologiesBenchmarkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendTechnologiesBenchmarkApplication.class, args);
	}

}
