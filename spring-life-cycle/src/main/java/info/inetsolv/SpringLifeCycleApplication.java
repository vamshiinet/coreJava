package info.inetsolv;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
public class SpringLifeCycleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringLifeCycleApplication.class, args);
		Car car = applicationContext.getBean(Car.class);
		car.drive();

//		Car car = new Car();
//		car.drive();
		
	}
	@Bean
	public Car car() {
		return new Car();
	}
	@Bean
	public Battery battery() {
		return new Battery();
	}
	
	@Bean
	public Tyre tyre() {
		return new Tyre();
	}
	@Bean
	public Engine engine() {
		return new Engine();
	}

}
