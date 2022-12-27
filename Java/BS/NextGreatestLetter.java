package Java.BS;

public class NextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int l = 0, len = letters.length, h = len - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (letters[mid] <= target)
                l = mid + 1;
            else
                h = mid;
        }
        return letters[l] > target ? letters[l] : letters[0];
    }

    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        System.out.println(nextGreatestLetter(letters, 'a'));
    }
}
