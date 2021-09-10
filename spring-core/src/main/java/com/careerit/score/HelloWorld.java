package com.careerit.score;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.careerit.cbook.ContactManager;


@ComponentScan(basePackages = {"com.careerit.score","com.careerit.cbook"})
public class HelloWorld {

		public static void main(String[] args) {
			
				ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorld.class);
				
//				EmployeeService emp = context.getBean(EmployeeService.class);
//				emp.showGreetings();
//				
//				NumberOperations obj = context.getBean(NumberOperations.class);
//				System.out.println(obj.max(2,3,4,1,9));
				
				ContactManager obj = context.getBean(ContactManager.class);
				System.out.println(obj);
		}
}
