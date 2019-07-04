package com.gwg.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * 我们的Example类上使用的第一个注解是@RestController。这被称为一个构造型注解。它为阅读代码的人们提供建议。
 * 对于Spring,该类扮演了一个特殊角色。在本示例中，我们的类是一个web @Controller,所以当处理进来的web请求时，
 * Spring会询问他
 *
 */
@SpringBootApplication //该@SpringBootApplication注解等价于以默认属性使用@Configuration, @EnableAntoConfiguration 和 @ComponentScan。
public class Application{
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(Application.class, args);
	}

}
