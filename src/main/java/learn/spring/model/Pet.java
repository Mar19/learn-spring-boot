package learn.spring.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pet {
	
	/**
	 * Sau khi tìm thấy một class đánh dấu @Component. 
	 * thì quá trình inject Bean xảy ra theo cách như sau:
	 * 1. Nếu Class không có hàm Constructor hay Setter. Thì sẽ sử dụng Java Reflection để đưa đối tượng vào thuộc tính có đánh dấu @Autowired.
	 * 2. Nếu có hàm Constructor thì sẽ inject Bean vào bởi tham số của hàm
	 * 3. Nếu có hàm Setter thì sẽ inject Bean vào bởi tham số của hàm
	 * 
	 */
	// 2. 
	Animal animal;
	
	// 1.
	public Pet (@Qualifier("chicken") Animal animal) {
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}

	// 3.
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
}
