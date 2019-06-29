package learn.spring.model;

import org.springframework.stereotype.Component;

@Component("chicken")
//@Primary
public class Chicken implements Animal {
	
	@Override
	public void eat() {
		System.out.println("The chicken eat bean");
	}
}
