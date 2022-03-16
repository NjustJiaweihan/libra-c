package com.dream.libra.c.api.api;

import com.dream.libra.response.Response;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/cache")
public interface QuestionApi {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "query", value = "query", required = true, dataType = "QuestionQuery", paramType = "body")
    })
    @PostMapping(value = "/question")
    Response<Integer> get(@RequestBody Integer query);

    @ApiImplicitParams({
            @ApiImplicitParam(name = "query", value = "query", required = true, dataType = "QuestionListQuery", paramType = "body")
    })
    @PostMapping(value = "/questions")
    Response<List<Integer>> list(@RequestBody Integer query);
}
