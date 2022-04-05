package customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeConstraintValidator implements ConstraintValidator<AgeValidator, String>{

	public void initialize(AgeValidator constraintAnnotation) {
		// TODO Auto-generated method stub
//		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		return value!=null && value.matches("[0-9]+")&& (value.length()<4);
	}

}
