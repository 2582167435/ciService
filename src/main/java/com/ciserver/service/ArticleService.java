package com.ciserver.service;

import cn.hutool.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public interface ArticleService {
    public JSONObject listArticle();
    public JSONObject getArticle(String articleNum);
}
