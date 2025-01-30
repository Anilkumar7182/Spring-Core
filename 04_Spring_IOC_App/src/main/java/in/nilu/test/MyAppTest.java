package in.nilu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nilu.service.UserService;

public class MyAppTest {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
	}

}
