package Java.DAILY;

public class Maximum69Number {
    public static int maximum69Number(int num) {
        int d = (int) Math.log10(num) + 1;
        int p = d;
        System.out.println(d);
        while (d-- > 0) {
            int g = (num / (int) Math.pow(10, p--)) * 10;
            int c = num / (int) Math.pow(10, d);
            if (c - g == 6)
                return num + (3 * (int) (Math.pow(10, d)));
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }
}
