package it.tccr.marqeta.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = "it.tccr.marqeta.gateway")
public class GatewayApplication {
  public static void main(String[] args) {
    log.info("Initialising Spring Boot application");
    SpringApplication.run(GatewayApplication.class, args);
  }
}
