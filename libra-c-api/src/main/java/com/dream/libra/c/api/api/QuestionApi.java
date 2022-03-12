package com.dream.libra.c.api.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/cache")
public interface QuestionApi {

    @PostMapping(value = "/question")
    void get();
}
