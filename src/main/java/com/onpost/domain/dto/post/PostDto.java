package com.onpost.domain.dto.post;

import com.onpost.global.error.validation.EditGroup;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class PostDto {

    @NotNull(message = "아이디를 찾을 수 없습니다.", groups = {EditGroup.class})
    private Long id;

    @NotBlank(message = "내용이 들어가야합니다.")
    private String content;

    @NotBlank(message = "제목이 들어가야합니다.")
    private String title;

    private String introduce;
}
