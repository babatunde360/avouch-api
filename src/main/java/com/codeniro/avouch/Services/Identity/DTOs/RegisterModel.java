package com.codeniro.avouch.Services.Identity.DTOs;

import com.codeniro.avouch.Services.Identity.validators.ValidPassword;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Setter
@Getter
public class RegisterModel {
    private String emailOrPhone;
    @ValidPassword
    @NonNull
    @NotBlank(message = "New password is mandatory")
    private String password;
    @NotBlank(message = "Confirm Password is mandatory")
    private String confirmPassword;
}
