package leetcode290;

import java.util.HashMap;
import java.util.HashSet;

public class CheckWordPattern {
	// O(n) time average but O(N^2) due to containsKey or contains
	public boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");

		if (pattern.length() != words.length) {
			return false;
		}

		HashMap<Character, String> map = new HashMap<>();

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < pattern.length(); i++) {
			// Check aa == dog dog
			if (map.containsKey(pattern.charAt(i))) {
				if (!map.get(pattern.charAt(i)).equals(words[i])) {
					return false;
				}
			} else {
				// Check ab == dog cat
				if (set.contains(words[i])) {
					return false;
				} else {
					map.put(pattern.charAt(i), words[i]);
					set.add(words[i]);
				}
			}
		}

		return true;
	}
}
