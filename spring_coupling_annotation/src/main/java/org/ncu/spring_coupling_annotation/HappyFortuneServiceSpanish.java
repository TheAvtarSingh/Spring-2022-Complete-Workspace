package org.ncu.spring_coupling_annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceSpanish implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Giving fortune in Spanish";
	}

}
