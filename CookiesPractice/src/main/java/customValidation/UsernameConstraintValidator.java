package customValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class UsernameConstraintValidator implements ConstraintValidator<UsernameValidator, String>{

	public void initialize(UsernameValidator constraintAnnotation) {
		// TODO Auto-generated method stub
//		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
//		return value!=null && value.matches("[0-9]+")&& (value.length()<4);
		/*
		 * Pattern pattern = Pattern.compile("s"); Matcher matcher =
		 * pattern.matcher(value); boolean found = matcher.equals(pattern); Pattern
		 * regexPattern = Pattern.compile("[^A-Za-z0-9]"); boolean found2 =
		 * !(matcher.equals(regexPattern));
		 */
		Boolean checkBoolean = value.contains(" ");
		checkBoolean = !checkBoolean;
		
		Boolean checkBoolean1 = value.contains("~`!@#$%^&*()-+=_{}[]|:;\"',.<>?/");
		checkBoolean1 = !checkBoolean1;
		
	
		return value!=null && checkBoolean&&checkBoolean1 ;
	}

}
