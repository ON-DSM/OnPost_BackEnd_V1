package com.onpost.domain.controller;

import com.onpost.domain.dto.comment.*;
import com.onpost.domain.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/leave")
    public void mainLeave(@Valid @RequestBody CommentCreateRequest commentRequest) {
        commentService.saveMain(commentRequest);
    }

    @PostMapping("/leave/sub")
    public void subLeave(@Valid @RequestBody CommentCreateRequest commentRequest) {
        commentService.saveSub(commentRequest);
    }

    @GetMapping("/show")
    public CommentResponse show(@RequestParam Long id) {
        return commentService.showMain(id);
    }

    @PutMapping("/edit")
    public void edit(@Valid @RequestBody CommentEditRequest commentEditRequest) {
        commentService.editComment(commentEditRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        commentService.deleteOne(id);
    }
}
