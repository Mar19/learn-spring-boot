package learn.spring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dog")
@Scope("prototype")
public class Dog implements Animal {
	
	@Override
	public void eat() {
		System.out.println("The dog eat meat");
	}
}
