package org.ncu.calculator_using_annotation;

import org.springframework.stereotype.Component;

@Component
public class MultiplicationService implements MathService {
public MultiplicationService() {
	// TODO Auto-generated constructor stub
	System.out.println("Bean Created for Multiplication Service");
}
	@Override
	public void operate(int x,int y) {
		// TODO Auto-generated method stub
		System.out.println("Multiplying");
		System.out.println(x*y);
	}

}
