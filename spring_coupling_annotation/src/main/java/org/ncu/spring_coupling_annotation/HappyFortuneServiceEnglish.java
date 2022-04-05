package org.ncu.spring_coupling_annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceEnglish implements FortuneService {

	public HappyFortuneServiceEnglish() {
		System.out.println("Bean Created");
	}
	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your Lucky Day";
	}

}
