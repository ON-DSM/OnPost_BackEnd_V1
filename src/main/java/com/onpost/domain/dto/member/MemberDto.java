package com.onpost.domain.dto.member;

import com.onpost.global.error.validation.EditGroup;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class MemberDto {

    @NotNull(message = "아이디를 찾을 수 없습니다.", groups = {EditGroup.class})
    private Long id;

    @NotBlank(message = "이름은 2자 이상, 10자 이하이여야 합니다.")
    @Size(min = 2, max = 10, message = "이름은 2자 이상, 10자 이하이여야 합니다.")
    private String name;

    private String introduce;
}
