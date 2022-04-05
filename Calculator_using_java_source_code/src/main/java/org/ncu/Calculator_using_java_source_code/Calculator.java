package org.ncu.Calculator_using_java_source_code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Calculator {
//Creating Interface References as we used to create for fortune Service in that This class implements FirstInterface
	MathService addService;
	MathService subService;
	MathService divService;
	MathService multiService;
//Using Setter Injection to set Values
@Autowired

	public Calculator(@Qualifier("additionService")AdditionService driverservice) {
		// TODO Auto-generated constructor stub
		this.addService = driverservice;
	}

@Autowired
	public Calculator(@Qualifier("subtractionService")SubtractionService subtractionService) {
		// TODO Auto-generated constructor stub
		this.subService = subtractionService;
	}

@Autowired
	public Calculator(@Qualifier("multiplicationService")MultiplicationService multiplicationService) {
		// TODO Auto-generated constructor stub
		this.multiService =multiplicationService;
	}

@Autowired
	public Calculator(@Qualifier("divisionService")DivisionService divisionService) {
		// TODO Auto-generated constructor stub
		this.divService = divisionService;
	}



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
