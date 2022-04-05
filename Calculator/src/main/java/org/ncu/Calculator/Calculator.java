package org.ncu.Calculator;

public class Calculator {
//Creating Interface References as we used to create for fortune Service in that This class implements FirstInterface
	MathService addService;
	MathService subService;
	MathService divService;
	MathService multiService;
//Using Setter Injection to set Values

	public void setAddService(MathService addService) {
		this.addService = addService;
	}

	public void setSubService(MathService subService) {
		this.subService = subService;
	}

	public void setDivService(MathService divService) {
		this.divService = divService;
	}

	public void setMultiService(MathService multiService) {
		this.multiService = multiService;
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
