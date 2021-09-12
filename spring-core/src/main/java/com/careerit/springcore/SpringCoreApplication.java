package com.careerit.springcore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.careerit.springcore.props.BookService;
import com.careerit.springcore.props.DatabaseConnection;
import com.careerit.springcore.props.GreetingsService;
import com.careerit.springcore.props.TenantConfiguration;
import com.careerit.springcore.scopes.DbSingletonScopeService;
import com.careerit.springcore.scopes.TaskManager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
	
//		TaskManager obj1 = context.getBean(TaskManager.class);
//		TaskManager obj2 = context.getBean(TaskManager.class);
//		TaskManager obj3 = context.getBean(TaskManager.class);
//		
//		DbSingletonScopeService ob1=context.getBean(DbSingletonScopeService.class);
//		DbSingletonScopeService ob2=context.getBean(DbSingletonScopeService.class);
//		
//		ApplicationContext context2=new ClassPathXmlApplicationContext("beans.xml");
//	
//		DbSingletonScopeService ob3=context2.getBean(DbSingletonScopeService.class);
//
//		System.out.println(ob1);
//		System.out.println(ob2);
//		System.out.println(ob3);
//
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(obj3);

		GreetingsService gservice = context.getBean(GreetingsService.class);
		System.out.println(gservice.getMessage());
	
		DatabaseConnection con = context.getBean(DatabaseConnection.class);
		System.out.println(con);
		
		BookService bookService = context.getBean(BookService.class);
		System.out.println(bookService.getBooks());
		
		TenantConfiguration tc = context.getBean(TenantConfiguration.class);
		System.out.println(tc.getTenantDetails("TATA"));
	}

}
