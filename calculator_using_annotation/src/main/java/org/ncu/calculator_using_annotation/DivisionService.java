package org.ncu.calculator_using_annotation;

import org.springframework.stereotype.Component;

@Component
public class DivisionService implements MathService {
public DivisionService() {
	// TODO Auto-generated constructor stub
	System.out.println("Bean Created for Division Service");
}
	@Override
	public void operate(int x,int y) {
		// TODO Auto-generated method stub
System.out.println("Dividing");
System.out.println(x/y);
	}

}
