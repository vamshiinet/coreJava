package info.inetsolv;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public Engine() {
		System.out.println("Engine Object is created....!");
	}
	
	public void start() {
		System.out.println("Engine Started....!");
	}

}
