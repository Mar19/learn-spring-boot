package learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learn.spring.model.Animal;
import learn.spring.model.Pet;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		// ApplicationContext chính là container, chứa toàn bộ các Bean 
		ApplicationContext context = SpringApplication.run(App.class, args);
		
		// Sau khi chạy xong, lúc này context sẽ chứa tất cả các Bean có đánh dấu là @Component
		// Lấy Bean ra bằng cách
		Animal animal = context.getBean(Animal.class);
		
		System.out.println("Instance: " + animal);
		
		// Use animal
		animal.eat();
		
		Pet pet = context.getBean(Pet.class);
		
		System.out.println("Pet instance" + pet);
		System.out.println("Pet animal" + pet.getAnimal());
		
		pet.getAnimal().eat();
	}

}
