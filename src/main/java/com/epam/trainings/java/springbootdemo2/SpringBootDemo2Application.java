package com.epam.trainings.java.springbootdemo2;

import com.epam.trainings.java.springbootdemo2.dao.CatRepository;
import com.epam.trainings.java.springbootdemo2.model.Cat;
import java.util.Arrays;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo2Application.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(CatRepository catRepository) {
	    return __ -> Arrays.stream("Мурзик,Барсик,Матроскин,Том,Гарфилд,Кузя".split(","))
											 .map(Cat::new)
											 .forEach(catRepository::save);
	}

}
