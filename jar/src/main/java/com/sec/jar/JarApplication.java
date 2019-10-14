package com.sec.jar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fireflying
 */
@SpringBootApplication
@MapperScan("com.sec.jar.mapper")
public class JarApplication {

	public static void main(String[] args) {
		SpringApplication.run(JarApplication.class, args);
	}

}
