package customValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = UsernameConstraintValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)



public @interface UsernameValidator {
	String message() default "Please Remove the Blank Spaces and Special Characters from Username";
	String value() default "name";
	
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};

}
