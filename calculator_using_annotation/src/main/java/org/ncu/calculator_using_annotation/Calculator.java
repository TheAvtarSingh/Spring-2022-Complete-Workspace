package org.ncu.calculator_using_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Calculator {
//Giving Anootations Spring will automatically create setter / Constructors and Field injection
	@Autowired
	@Qualifier("additionService")
	MathService addService;
	@Autowired
	@Qualifier("subtractionService")
	MathService subService;
	@Autowired
	@Qualifier("divisionService")
	MathService divService;
	@Autowired
	@Qualifier("multiplicationService")
	MathService multiService;

//Getting Result from Dependency Classes From Above References 
	public void getAddServiceResult(int x, int y) {
		addService.operate(x, y);
	}

	public void getDivServiceResult(int x, int y) {
		divService.operate(x, y);
	}

	public void getMultiServiceResult(int x, int y) {
		multiService.operate(x, y);
	}

	public void getSubServiceResult(int x, int y) {
		subService.operate(x, y);
	}

//                 -----------Create If else in App.java   or Create If else here------

	/*
	 * public void Compute(String what,int x,int y) { if (what=="add") {
	 * getAddServiceResult(x,y); } else if(what=="sub"){ getSubServiceResult(x,y);
	 * }else if (what=="multi") { getMultiServiceResult(x,y); }else if (what ==
	 * "div") { getDivServiceResult(x,y); }else {
	 * System.out.println("Operation Not Found"); } }
	 */

	

}
