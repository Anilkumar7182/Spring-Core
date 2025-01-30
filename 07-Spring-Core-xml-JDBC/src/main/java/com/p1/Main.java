package com.p1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.p1.entity.repo.BookRepo;
import com.p1.service.BookService;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
		
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext(AppConfig.class);
		 */
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		BookService bookService = context.getBean(BookService.class);
		
		// initialize the database table
		context.getBean(BookRepo.class).init();
		
		// Read book data from keybord and insert into databases
		bookService.ReadAndInsertBook();
	}
}
