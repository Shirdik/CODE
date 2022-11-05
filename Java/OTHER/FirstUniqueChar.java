package Java;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static int firstUnique(String s) {
        int res = -1;
        CharacterIterator itr = new StringCharacterIterator(s);
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        Map<Character, Integer> indexMap = new LinkedHashMap<>();
        int i = 0;
        while (itr.current() != CharacterIterator.DONE) {
            if (countMap.containsKey(itr.current()))
                countMap.put(itr.current(), countMap.get(itr.current()) + 1);
            else {
                indexMap.put(itr.current(), i);
                countMap.put(itr.current(), 1);
            }
            itr.next();
            i++;
        }
        System.out.println(countMap);
        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                res = indexMap.get(c);
                break;
            }
        }
        return res;
    }

    public static int firstUnique2(String s) {
        int res = -1;
        char arr[] = s.toCharArray();
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        Map<Character, Integer> indexMap = new LinkedHashMap<>();
        int i = 0;
        for (char x : arr) {
            if (countMap.containsKey(x))
                countMap.put(x, countMap.get(x) + 1);
            else {
                indexMap.put(x, i);
                countMap.put(x, 1);
            }
            i++;
        }
        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                res = indexMap.get(c);
                break;
            }
        }
        return res;
    }

    public static int firstUnique3(String s) {

        int res = -1;
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        Map<Character, Integer> indexMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (countMap.containsKey(s.charAt(i)))
                countMap.put(s.charAt(i), countMap.get(s.charAt(i)) + 1);
            else {
                indexMap.put(s.charAt(i), i);
                countMap.put(s.charAt(i), 1);
            }
        }
        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                res = indexMap.get(c);
                break;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        // System.out.println(firstUnique("leetcode"));
        System.out.println(firstUnique3("aabb"));

    }
}
