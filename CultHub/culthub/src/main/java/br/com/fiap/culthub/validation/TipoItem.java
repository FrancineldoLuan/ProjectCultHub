package br.com.fiap.culthub.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TipoItemValidator.class)
public @interface TipoItem {

    String message() default "{item.tipo}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
