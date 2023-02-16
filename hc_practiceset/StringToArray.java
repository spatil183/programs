package hc_practiceset;

import java.util.Arrays;
import java.util.List;

public class StringToArray {

	public static void main(String[] args) {
		
		String s1 = "Mahesh,Sachin,Swapnil,Suraj";
		
//		String[] s2 = s1.split("");
//		
//		List<String> list =new ArrayList<>();
//	      System.out.println(Arrays.asList(s2));
//		
//		for(String s:s2) {
//			System.out.print(s);
//		}
		
		
		List<String> list = Arrays.asList(s1.split(","));
//		
//		System.out.println(list);
		list.stream().forEach(System.out::println);
//		List<String> list1 =list.stream().collect(Collectors.toList());
//		System.out.println(list1);
		
	}
}
