package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("------- I18n Profiles");
		I18nController i18nController = (I18nController) appContext.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		System.out.println("------- Primary Bean");
		MyController myController = (MyController) appContext.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) appContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) appContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) appContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
