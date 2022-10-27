package Java.EASY;

public class LargestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null)
            return null;
        if (strs.length == 1 || strs[0] == "")
            return strs[0];
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (res == "")
                break;
            for (int j = 0; j < strs[i].length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j) && j != 0) {
                    res = strs[i].substring(0, j);
                    break;
                } else if (res.charAt(j) != strs[i].charAt(j) && j == 0) {
                    res = "";
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] s = { "", "b" };
        System.out.println(longestCommonPrefix(s));
    }
}
