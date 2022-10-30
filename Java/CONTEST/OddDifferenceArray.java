package Java.CONTEST;

import java.util.Arrays;

public class OddDifferenceArray {

    public static int[] diff(String s) {
        int x[] = new int[s.length() - 1];
        for (int i = 0; i < s.length() - 1; i++)
            x[i] = s.charAt(i + 1) - s.charAt(i);
        return x;
    }

    public static String oddString(String[] words) {
        int[] temp1 = diff(words[0]);
        int[] temp2 = diff(words[1]);
        if (Arrays.equals(temp1, temp2))
            for (int i = 2; i < words.length; i++) {
                if (!Arrays.equals(diff(words[i]), temp1))
                    return words[i];
            }
        return Arrays.equals(diff(words[2]), temp1) ? words[1] : words[0];
    }

    public static void main(String[] args) {

        String words[] = { "mll", "edd", "jii", "tss", "fee", "dcc", "nmm", "abb", "utt", "zyy", "xww", "tss", "wvv",
                "xww", "utt" };
        // for (String x : words) {
        // int y[] = diff(x);
        // for (int i : y)
        // System.out.print(i + " ");
        // System.out.println();
        // }
        System.out.println(oddString(words));

    }

}
