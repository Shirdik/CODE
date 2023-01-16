package Java.DAILY;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int stations = gas.length;
        if (stations == 1)
            return gas[0] - cost[0] >= 0 ? 0 : -1;
        else {

            long s = 0;
            int gasRemaining[] = new int[stations];
            for (int i = 0; i < stations; i++) {
                int t = gas[i] - cost[i];
                gasRemaining[i] = t;
                s += t;
            }
            if (s < 0)
                return -1;
            else {
                for (int i = 0; i < stations; i++) {
                    if (gasRemaining[i] > 0) {
                        int x = 0;
                        for (int j = i; j < stations + i; j++) {
                            x += gasRemaining[j % stations];
                            if (x < 0)
                                break;
                        }
                        if (x >= 0)
                            return i;
                    }
                }
            }
            return -1;
        }
    }

    public static int canCompleteCircuit1(int[] gas, int[] cost) {
        int stations = gas.length, r = 0;
        long s = 0, t = 0;
        for (int i = 0; i < stations; i++) {
            int x = gas[i] - cost[i];
            s += x;
            t += x;
            if (t < 0) {
                r = i + 1;
                t = 0;
            }
        }
        return s >= 0 ? r : -1;

    }

    public static void main(String[] args) {

    }
}
