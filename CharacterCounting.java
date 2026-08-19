import java.util.*;
import java.util.stream.*;

public class CharacterCounting{


	public static void main(String[]args){

	String str = "springboot Microservices kafka java maang";
	
	List<String> names = Arrays.asList("vamshi","krishna","anusha","aadvika");
	Map<Character,Long> charactersMap = names.stream()
			.flatMap(name -> name.chars().mapToObj(ch->(char)ch))
			.collect(Collectors.groupingBy(c->c,Collectors.counting()));

	System.out.println( charactersMap);

//	charactersMap.forEach((k,v)->System.out.println(k+": "+v));

	
	//String  	

	Map<Character,Long> strMap = str.toLowerCase()
					.chars()
					.mapToObj(ch->(char)ch).filter(c->c!=' ')
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));

		System.out.println(strMap);

//		strMap.forEach((k,v) -> System.out.println(k+": "+v));




}

}