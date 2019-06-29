package learn.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pet {
	
	/**
	 * Điều này nói với Spring Boot hãy
	 * tự inject (tiêm) một instance của Animal vào thuộc tính này khi khởi tạo Pet.
	 */
	@Autowired
	Animal animal;
	
	public Pet (Animal animal) {
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
