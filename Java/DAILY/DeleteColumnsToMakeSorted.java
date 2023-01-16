package Java.DAILY;

public class DeleteColumnsToMakeSorted {
    public static int minDeletionSize(String[] strs) {
        int r = strs.length, c = strs[0].length(), count = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    count++;
                    j = r;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
