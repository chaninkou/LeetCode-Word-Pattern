package leetcode290;

public class Main {
	public static void main(String[] args) {
		String pattern = "acac";
		
		String s = "dog cat dog eat";
		
		System.out.println("Pattern: " + pattern + " s: " + s);
		
		CheckWordPattern solution = new CheckWordPattern();
		
		System.out.println("Solution: " + solution.wordPattern(pattern, s));
	}
}
