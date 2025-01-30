package in.nilu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nilu.service.BookService;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		BookService bookService = ctxt.getBean(BookService.class);
		bookService.saveBook();
	}

}
