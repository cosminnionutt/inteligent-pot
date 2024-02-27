package inteligentpot.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;

import inteligentpot.com.core.config.JacksonConfig;
import inteligentpot.com.core.domain.MotorControl;

@SpringBootApplication(scanBasePackages = {
		"inteligentpot.com.core.service,inteligentpot.com.core.config, inteligentpot.com.controller" })
@EntityScan(basePackages = { "inteligentpot.com.core.domain" })
@Import(value = {MotorControl.class, JacksonConfig.class})
public class InteligentPotApplication {
	public static void main(String[] args) {
		SpringApplication.run(InteligentPotApplication.class, args);
	}
}
