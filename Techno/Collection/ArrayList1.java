package Techno.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(13);
		list.add(11);
		list.add(16);
		list.add(13);
		list.add(22);
		list.add(19);
		System.out.println(list);
		
		Set<Integer> s = new HashSet<>(list);
		System.out.println(s);
	}
}
