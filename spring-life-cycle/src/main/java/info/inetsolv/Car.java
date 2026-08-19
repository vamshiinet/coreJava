package info.inetsolv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	Battery battery;
	@Autowired
	Tyre tyre;
	@Autowired
	Engine engine;
	public Car() {
		System.out.println("Car Object created");
	}
	
	public void drive() {
		System.out.println("----------driving Started---------");
		engine.start();
		battery.providePower();
		tyre.rotate();
		System.out.println("----------driving Completed---------");
	}

}
