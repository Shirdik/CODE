// package Java.CONTEST;

// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Map;
// import java.util.Set;

// public class MakeDistinctCharactersEqual {

// public boolean isItPossible(String word1, String word2) {
// Map<Character, Integer> m1 = new HashMap<>();
// Map<Character, Integer> m2 = new HashMap<>();
// int l1 = word1.length(), l2 = word2.length();
// for (int i = 0; i < l1; i++)
// m1.put(word1.charAt(i), m1.getOrDefault(word1.charAt(i), 0) + 1);
// for (int i = 0; i < l2; i++)
// m2.put(word1.charAt(i), m2.getOrDefault(word2.charAt(i), 0) + 1);
// if (Math.abs(m1.keySet().size() - m2.keySet().size()) <= 1) {

// } else
// return false;
// }

// public boolean isItPossible1(String word1, String word2) {
// Set<Character> s1 = new HashSet<>();
// Set<Character> s2 = new HashSet<>();
// Set<Character> e1 = new HashSet<>();
// Set<Character> e2 = new HashSet<>();

// for (char x : word1.toCharArray()) {
// if (s1.contains(x))
// e1.add(x);
// else
// s1.add(x);
// }
// for (char x : word2.toCharArray()) {
// if (s2.contains(x))
// e2.add(x);
// else
// s2.add(x);
// }
// int diff = Math.abs(s1.size() - s2.size());
// if (diff == 0)
// return true;
// else if (diff > 1)
// return false;
// else {
// if (s1.size() < s2.size()) {

// }
// }

// }
// }
