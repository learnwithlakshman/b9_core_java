package com.careerit.cj.json;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface AuthorInfo{
	public String name() default "Krish";
	public String version() default "V1.0";
	
}

@AuthorInfo
public class EmployeeManager {

		public static void main(String[] args) {
			
				Annotation[] arr = EmployeeManager.class.getAnnotationsByType(AuthorInfo.class);
				
				AuthorInfo obj = (AuthorInfo)arr[0];
				System.out.println(obj.name());
				System.out.println(obj.version());
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		private static AppUser getLoginUser() {
			return new AppUser("krishna","krish@123!","krish.t@gmail.com",LocalDate.of(1984,9,20));
			
		}
}
