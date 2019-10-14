package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsController {
	@Resource
	private RedisTemplate<String, String> redisTemplate;
	
	
	
	@RequestMapping("list")
	public void  goodList() {
		
	}
	

}
