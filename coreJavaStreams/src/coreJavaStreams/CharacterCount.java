package coreJavaStreams;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {

		String sentence = "aaA ll NN mM WW";
		Map<Character, Long> charMap = sentence.toLowerCase().chars().mapToObj(c -> (char)c)
				.filter(c->c!=' ').collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		charMap.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
