package Java;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a'] += 1;
        for (int i = 0; i < t.length(); i++) {
            if (freq[t.charAt(i) - 'a']-- == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "naaram"));
    }
}
