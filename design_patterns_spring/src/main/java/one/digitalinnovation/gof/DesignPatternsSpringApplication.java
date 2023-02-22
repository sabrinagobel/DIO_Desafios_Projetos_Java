package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
/*
 * @ComponentScan({"one.digitalinnovation.gof.controller"})
 * 
 * @EntityScan({"one.digitalinnovation.gof.model"})
 * 
 * @EnableJpaRepositories({"one.digitalinnovation.gof.repository"})
 */
public class DesignPatternsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsSpringApplication.class, args);
	}

}
