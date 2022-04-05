package org.ncu.calculator_using_annotation;

import org.springframework.stereotype.Component;

@Component
public class AdditionService implements MathService {
public AdditionService() {
	// TODO Auto-generated constructor stub
	System.out.println("Bean Created for Addition Service");
}
	@Override
	public void operate(int x,int y) {
		// TODO Auto-generated method stub
System.out.println("Adding");
System.out.println(x+y);
	}

}
