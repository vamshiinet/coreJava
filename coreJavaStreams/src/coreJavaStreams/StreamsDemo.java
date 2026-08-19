package coreJavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Bob","john","Alexander","Ann");
		Map<Integer,List<String>> map = names.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}

}
