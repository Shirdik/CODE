package Java;

public class RansomNote {

    public static boolean ransom(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        int freq[] = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (freq[ransomNote.charAt(i) - 'a']-- == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(ransom("ab", "baa"));

    }
}
