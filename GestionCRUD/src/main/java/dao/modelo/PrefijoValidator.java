package dao.modelo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class PrefijoValidator implements ConstraintValidator<prefijo, String> {
	
	@Override
	public boolean isValid(String a, ConstraintValidatorContext context) {

		boolean valprefijo;

		if (a != null) {
			valprefijo = a.startsWith("829") || a.startsWith("849") || a.startsWith("809");
			
		} else valprefijo = false;

		return valprefijo;

	}
}
