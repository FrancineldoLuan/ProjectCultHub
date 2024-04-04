package br.com.fiap.culthub.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TipoItemValidator implements ConstraintValidator<TipoItem, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.equals("ENTRADA") || value.equals("SAIDA");
    }

}
