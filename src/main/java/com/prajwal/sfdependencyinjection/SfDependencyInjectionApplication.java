package com.prajwal.sfdependencyinjection;

import com.prajwal.sfdependencyinjection.controllers.ConstructorInjectedController;
import com.prajwal.sfdependencyinjection.controllers.I18nController;
import com.prajwal.sfdependencyinjection.controllers.MyController;
import com.prajwal.sfdependencyinjection.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDependencyInjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SfDependencyInjectionApplication.class, args);
		
		
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) context.getBean("myController");
		
		String greeting = myController.sayHi();
		
		System.out.println("------- Primary Bean");
		System.out.println(myController.sayHi());
		
		//System.out.println(greeting);
		
		System.out.println("-------------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		
		System.out.println("-------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
	}

}
