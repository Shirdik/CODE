package Java.EASY;

public class ExcelColumn {
    public static int titleToNumber(String columnTitle) {
        if (columnTitle.length() == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++)
            res += Math.pow(26, (columnTitle.length() - 1 - i)) * (columnTitle.charAt(i) - 'A' + 1);
        return res;
    }

    public static int titleToNumber1(String columnTitle) {
        if (columnTitle.length() == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++)
            res = res * 26 + (columnTitle.charAt(i) - 'A' + 1);
        return res;
    }

    public static void main(String[] args) {
        String columnTitle = "AAA";
        System.out.println(titleToNumber1(columnTitle));
        System.out.println(titleToNumber1(columnTitle));
    }
}
