package info.inetsolv;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	public Battery() {
		System.out.println("Battery Object Created.....!");
	}
	
	public void providePower() {
		System.out.println("Battery is providing power....!");
	}

}
