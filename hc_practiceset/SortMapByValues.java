package hc_practiceset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortMapByValues {
	public static void main(String[] args) {
		
		Map<String, Integer> hm = new HashMap<>();
		hm.put("Mahesh M", 90000);
		hm.put("Swapnil", 60000);
		hm.put("Sachin", 70000);
		hm.put("Bhushan", 40000);
		hm.put("Indrajit", 80000);
		hm.put("Mahesh B", 65000);
		
		System.out.println(hm);
		
//		Map<String,Integer> hm1 = hm.entrySet().stream().filter(i->i.getValue()>40000).collect(Collectors.toMap(i->i.getKey(), i->i.getValue()));
//		System.out.println(hm1);
			
		Map<String,Integer> hm2 = hm.entrySet().stream().filter(i->i.getValue()>60000).collect(Collectors.toMap(i->i.getKey(), i->i.getValue()));
		System.out.println(hm2);
	}
}
