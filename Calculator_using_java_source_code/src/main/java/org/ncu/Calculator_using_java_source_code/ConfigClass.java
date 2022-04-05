package org.ncu.Calculator_using_java_source_code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

	@Bean
	public AdditionService addservice() {
		return new AdditionService();
		
	}
	@Bean
	public SubtractionService subtractionService() {
		return new SubtractionService();
	}
	@Bean
	public MultiplicationService multiplicationService() {
		return new MultiplicationService();
	}
	@Bean
	public DivisionService divisionService() {
		return new DivisionService();
	}
	@Bean("add")
	public Calculator adservice() {
		return new Calculator(addservice());
	}
	@Bean("sub")
	public Calculator subservice() {
		return new Calculator(subtractionService());
	}
	@Bean("multi")
	public Calculator mulservice() {
		return new Calculator(multiplicationService());
	}
	@Bean("div")
	public Calculator divservice() {
		return new Calculator(divisionService());
	}

	
	
}
