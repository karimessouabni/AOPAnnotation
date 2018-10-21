package myAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {


    @Override
    public void initialize(ContactNumberConstraint contactNumberConstraint) {

    }

    @Override
    public boolean isValid(String tel, ConstraintValidatorContext constraintValidatorContext) {
        return tel != null && tel.matches("[0-9]+")
                && (tel.length() > 8) && (tel.length() < 14);
    }
}
