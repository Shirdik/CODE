package Java.DAILY;

import java.util.Arrays;

public class MaximumBags {
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int filledBags = 0, bags = capacity.length;
        int[] freeSpace = new int[bags];
        for (int i = 0; i < bags; i++)
            freeSpace[i] = capacity[i] - rocks[i];
        Arrays.sort(freeSpace);
        int i = 0;
        while (additionalRocks > 0 && i < bags) {
            if (additionalRocks >= freeSpace[i])
                filledBags++;
            additionalRocks -= freeSpace[i];
            i++;
        }
        return filledBags;
    }

    public static void main(String[] args) {

    }
}
