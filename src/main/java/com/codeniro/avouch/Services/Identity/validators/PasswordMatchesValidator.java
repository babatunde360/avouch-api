package com.codeniro.avouch.Services.Identity.validators;

import com.codeniro.avouch.Services.Identity.DTOs.RegisterModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches passwordMatches) {
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        RegisterModel userDto = (RegisterModel) obj;
        return userDto.getPassword().equals(userDto.getConfirmPassword());
    }
}
