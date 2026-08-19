package info.inetsolv;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	public Tyre() {
		System.out.println("Tyre Object Created.....!");
	}

	public void rotate() {
		System.out.println("Tyres are rotating....!");
	}
}
