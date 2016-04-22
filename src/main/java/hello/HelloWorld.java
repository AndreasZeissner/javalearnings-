package hello; 

import org.joda.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {
	public static void main(String[] args){
		Greeter greeter = new Greeter(); 
		System.out.println(greeter.sayHello());

		LocalTime currentTime = new LocalTime(); 
		System.out.println("The current Time is: " + currentTime);

		SpringApplication.run(HelloWorld.class, args);

	}
}
