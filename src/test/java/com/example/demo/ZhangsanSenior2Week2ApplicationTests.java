package com.example.demo;



import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Goods;
import com.tzh.utils.IOToFileUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhangsanSenior2Week2ApplicationTests {
	//引入redisTemplate
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	

	@Test
	public void contextLoads() {
	}
	//编写测试
	@Test
	public void ListGoods() {
		//使用自己的工具包工程流处理工具方法正确读取文件
		List<String> readFileByLinesList = IOToFileUtils.readFileByLinesList(System.getProperty("user.dir")+"/src/main/resources/static/test.txt");
		BoundListOperations<String, Object> boundListOps = redisTemplate.boundListOps("goodList");
		//foreacher按行截取
		for (String string : readFileByLinesList) {
			//System.out.println(string);
			//按==截取
			String[] split = string.split("\\==");
			
			Goods good = new Goods();
			good.setGid(split[0]);
			good.setName(split[1]);
			good.setPrice(split[2]);
			good.setCont(split[3]);
			
			
		}
		//保持一致
		Long leftPush = boundListOps.leftPush(readFileByLinesList);
		
		
		
		
	
	
	}
	
	
	@Test
	public void zsetList() {
		//使用自己的工具包工程流处理工具方法正确读取文件
		List<String> readFileByLinesList = IOToFileUtils.readFileByLinesList(System.getProperty("user.dir")+"/src/main/resources/static/test.txt");
		BoundListOperations<String, Object> boundListOps = redisTemplate.boundListOps("goodList");
		//foreacher按行截取
		for (String string : readFileByLinesList) {
			//System.out.println(string);
			//按==截取
			String[] split = string.split("\\==");
			
			Goods good = new Goods();
			good.setGid(split[0]);
			good.setName(split[1]);
			good.setPrice(split[2]);
			good.setCont(split[3]);
			
			
		}
		
		
		
		
		
		
	
	
	}

}
