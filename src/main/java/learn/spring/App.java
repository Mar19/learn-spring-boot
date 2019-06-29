package learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learn.spring.model.Pet;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		// ApplicationContext chính là container, chứa toàn bộ các Bean 
		ApplicationContext context = SpringApplication.run(App.class, args);
		
		Pet pet = context.getBean(Pet.class);
		
		System.out.println("Pet instance" + pet);
		System.out.println("Pet animal" + pet.getAnimal());
		
		pet.getAnimal().eat();
	}

}
