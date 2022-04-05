package org.ncu.spring_Greeting_Java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:field.properties")
public class ConfigClass {
	//English
//Dependency Object
	@Bean
	public FortuneServce fortuneServceeng() {
		return new FortuneinEnglish();
	}
	//Dependent Injection
	@Bean("english")
	public GreetingService greetinginenglish() {
		return new GreetinEnglish(fortuneServceeng());
	}
	
	//French
	//Dependency Object
	@Bean
	public FortuneServce fortuneServcefrench() {
		return new FortuneinFrench();
	}
	//Dependent Injection
	@Bean("french")
	public GreetingService greetinginfrench() {
		return new GreetinFrench(fortuneServcefrench());
	}
	
	//Spanish
	//Dependency Object
@Bean
public FortuneServce fortuneServcespanish() {
	return new FortuneinSpanish();
}
//Dependent Injection
@Bean("spanish")
public GreetingService greetinginspanish() {
	return new GreetinSpanish(fortuneServcespanish());
}

//Random Fortune
//Dependency Class
@Bean
public FortuneServce randomServce() {
	return new RandomFortuneService();
}

//Dependent Class
@Bean("random")
public GreetingService greetingService() {
	return new RandomFortuneInjection(randomServce());
}
}

