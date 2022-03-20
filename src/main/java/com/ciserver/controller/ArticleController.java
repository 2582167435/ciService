package com.ciserver.controller;

import cn.hutool.json.JSONObject;
import com.ciserver.common.ResultData;
import com.ciserver.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/list")
    public ResultData listArticle(){
        JSONObject jsonObject = articleService.listArticle();
        return ResultData.success(jsonObject);
    }

    @GetMapping("/{articleNum}")
    public ResultData getArticle(@PathVariable String articleNum){
        JSONObject jsonObject = articleService.getArticle(articleNum);
        return ResultData.success(jsonObject);
    }
}
