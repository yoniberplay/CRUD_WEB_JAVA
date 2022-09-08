package dao.modelo;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER,
    ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PrefijoValidator.class)
@Documented
public @interface prefijo {
	
	 String message() default "829, 849 o 809";
	 
	 Class<?>[] groups() default {};

	 Class<? extends Payload>[] payload() default {};

}
