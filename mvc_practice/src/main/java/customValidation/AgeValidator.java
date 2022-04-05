package customValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = AgeConstraintValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)


public @interface AgeValidator {
	
	String message() default "Invalid age";
	String value() default "18";
	
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};

}
