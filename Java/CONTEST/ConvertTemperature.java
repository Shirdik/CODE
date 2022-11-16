package Java.CONTEST;

public class ConvertTemperature {

    public static double[] convertTemp(double celcius) {
        double t[] = new double[2];
        t[0] = celcius + 273.15;
        t[1] = celcius * 1.80 + 32;
        return t;

    }

    public static void main(String[] args) {

        double x[] = convertTemp(121.11);
        System.out.println(x[0] + " " + x[1]);

    }
}
