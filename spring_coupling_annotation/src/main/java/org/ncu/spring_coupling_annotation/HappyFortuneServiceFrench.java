package org.ncu.spring_coupling_annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceFrench implements FortuneService {

	public HappyFortuneServiceFrench() {
		System.out.println("Bean Created for French");
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Aujourd'hui est ton jour de chance";
	}

}
