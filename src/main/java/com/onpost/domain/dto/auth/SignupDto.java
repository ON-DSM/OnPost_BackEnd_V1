package com.onpost.domain.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
public class SignupDto {

    @NotBlank(message = "이메일 유형이여야 합니다.")
    @Email
    private String email;

    @NotBlank(message = "이름은 6자 이상, 16자 이하이여야 합니다.")
    @Size(min = 6, max = 16)
    private String username;

    @NotBlank(message = "패스워드는 8자 이상, 20자 이하여야 합니다.")
    @Size(min = 8, max = 20)
    private String password;
}
