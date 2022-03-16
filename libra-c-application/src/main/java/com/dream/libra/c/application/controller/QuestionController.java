package com.dream.libra.c.application.controller;

import com.dream.libra.c.api.api.QuestionApi;
import com.dream.libra.response.Response;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController implements QuestionApi {

    @Override
    public Response<Integer> get(Integer query) {
        return null;
    }

    @Override
    public Response<List<Integer>> list(Integer query) {
        return null;
    }
}
