package org.ncu.spring_coupling_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpanishGreetingService implements GreetingService {
	
@Autowired
@Qualifier("happyFortuneServiceSpanish")
FortuneService fortuneService;
@Value("${email}")
private String emailString;
public String getEmailString() {
	return emailString;
}
/*
 * @Override public String getDailyFortune() { // TODO Auto-generated method
 * stub return "Tienes un día de suerte"; }
 */



  public String getAddressString() { return addressString; }

@Value("${address}")
private String addressString;

	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
