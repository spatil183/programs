package Techno.string;

import java.util.HashMap;
import java.util.Map;

public class WordsCount {

	public static void main(String[] args) {
		
		String s = "Welcome to java wprld";
		Map<String, Integer> map = new HashMap<>();
		String str[] = s.split(" ");
		for(String word:str) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
	}
}
