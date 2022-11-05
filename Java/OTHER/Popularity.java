package Java;

import java.util.*;

public class Popularity {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the number of testcases: ");
        int testcases = in.nextInt();
        List<List<Integer>> output = new ArrayList<>();
        int votesArray[][] = new int[testcases][];
        int webseriesArray[] = new int[testcases];
        int windowArray[] = new int[testcases];
        for (int i = 0; i < testcases; i++) {
            // System.out.println("Enter the number of series: ");
            webseriesArray[i] = in.nextInt();
            // System.out.println("Enter the batch window: ");
            windowArray[i] = in.nextInt();
            int votes[] = new int[webseriesArray[i]];
            for (int j = 0; j < webseriesArray[i]; j++)
                votes[j] = in.nextInt();
            votesArray[i] = votes;
            // Input done
        }
        in.close();
        // Input Print

        // for (int i = 0; i < testcases; i++) {
        // System.out.print(webseriesArray[i] + " " + windowArray[i]);
        // System.out.println();
        // for (int x : votesArray[i])
        // System.out.print(x + " ");
        // }

        for (int i = 0; i < testcases; i++) {
            int n = webseriesArray[i];
            int k = windowArray[i];
            int votes[] = votesArray[i];

            // System.out.print(n + " " + k);
            // System.out.println();
            // for (int x : votes)
            // System.out.print(x + " ");

            List<Integer> tempOutput = new ArrayList<>();

            Deque<Integer> window = new LinkedList<Integer>();
            HashMap<Integer, Integer> count = new HashMap<>();
            // count.sort(())

            for (int j = 0; j < k; j++) {
                window.add(votes[j]);
                if (count.containsKey(votes[j]))
                    count.put(votes[j], count.get(votes[j]) + 1);
                else
                    count.put(votes[j], 1);
            }
            int max = 0;
            for (int x : count.keySet())
                max = Math.max(count.get(x), max);
            tempOutput.add(max);

            // System.out.println(count);
            // System.out.println(window);
            // System.out.println(max);

            for (int j = k; j < n; j++) {
                count.put(window.peekFirst(), count.get(window.pollFirst()) - 1);
                window.add(votes[j]);
                if (count.containsKey(votes[j]))
                    count.put(votes[j], count.get(votes[j]) + 1);
                else
                    count.put(votes[j], 1);
                max = 0;
                // HashMap<Integer, Integer>sorted = count
                // .entrySet()
                // .stream()
                // .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                // .collect(
                // toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                // LinkedHashMap::new));
                // // for (int x : count.keySet())
                // max = Math.max(count.get(x), max);
                // tempOutput.add(max);
                // System.out.println(count);
                // System.out.println(window);
                // System.out.println(max);
            }
            output.add(tempOutput);
        }

        System.out.println(output);

    }
}
