package br.com.projuris;

import java.util.LinkedHashMap;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class MyFindChar implements FindCharachter {

	@Override
	public char findChar(String word) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] chars = word.toCharArray();

		for (Character ch : chars) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> keys = map.keySet();

		for (Character ch : keys) {
			if (map.get(ch) == 1) {
				return ch;
			}
		}

		return ' ';

	}

}
