package com.listShorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Aashish","Roy","Rbhi","Abhay","Ravi","Jeet","123");
		List<String> slist=list.stream().sorted().collect(Collectors.toList());
		System.out.println(slist);
	}

}
