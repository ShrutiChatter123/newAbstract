package configuration;

import java.beans.BeanProperty;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.iskonJdbc")
public class StudentConfiguration {

	@Bean
	public Validator  validator() {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator ref=factory.getValidator();
		return ref;
		
		
	}
	
	
	
	
	
	
	
	
	
}
