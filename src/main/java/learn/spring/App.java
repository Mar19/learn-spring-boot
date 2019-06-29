package learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import learn.spring.model.Pet;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		// ApplicationContext chính là container, chứa toàn bộ các Bean
		System.out.println("> Trước khi IoC Container được khởi tạo");
		ApplicationContext context = SpringApplication.run(App.class, args);
		System.out.println("> Sau khi IoC Container được khởi tạo");
		
		Pet pet = context.getBean(Pet.class);
		
		System.out.println("> Trước khi IoC Container destroy bean");
		((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(pet);
		System.out.println("> Sau khi IoC Container destroy bean");
	}

}
