package Techno.Collection;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new java.util.ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(45);
		list.add(44);
		list.add(54);
		list.add(13);
		list.add(22);
//		System.out.print(list);
		for(Integer ele:list) {
			System.out.println(ele);
		}
	}
}
