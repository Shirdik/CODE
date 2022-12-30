package Java.DAILY;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SingleThreadedCPU {

    static PriorityQueue<Integer> processQueue;
    static Map<Integer, PriorityQueue<Integer>> indexer;

    public static int[] getOrder(int[][] tasks) {
        processQueue = new PriorityQueue<>();
        indexer = new HashMap<>();
        int time = 1, cpu = 0, nofTasksCompleted = 0, nofTasks = tasks.length, r[] = new int[nofTasks];
        while (nofTasksCompleted < nofTasks) {
            processAllocator(tasks, time++, nofTasks - 1);
            if (cpu == 0 && !processQueue.isEmpty()) {
                cpu = processQueue.remove();
                r[nofTasksCompleted++] = indexer.get(cpu).remove();
            }
            if (cpu > 0)
                cpu--;
        }
        return r;
    }

    private static void processAllocator(int[][] tasks, int time, int nofTasks) {
        for (int i = 0; i < nofTasks; i++) {
            if (tasks[i][0] == time) {
                int v = i;
                int k = tasks[i][1];
                processQueue.add(k);
                PriorityQueue<Integer> t = indexer.getOrDefault(k, new PriorityQueue<>());
                t.add(v);
                indexer.put(k, t);
            }
        }
        return;
    }

    // private static void processAllocator(int[][] tasks, int time, int nofTasks) {
    // int l = 0, h = nofTasks;
    // while (l <= h) {
    // int mid = l + (h - l) / 2;
    // if (tasks[mid][0] == time) {
    // int v = mid;
    // int k = tasks[mid][1];
    // processQueue.add(k);
    // PriorityQueue<Integer> t = indexer.getOrDefault(k, new PriorityQueue<>());
    // t.add(v);
    // indexer.put(k, t);
    // h = mid - 1;
    // } else if (tasks[mid][0] < time)
    // l = mid + 1;
    // else
    // h = mid - 1;
    // }
    // return;
    // }

    public static void main(String[] args) {
        int[][] tasks = { { 1, 2 }, { 2, 4 }, { 3, 2 }, { 4, 1 } };
        int[][] tasks1 = { { 7, 10 }, { 7, 12 }, { 7, 5 }, { 7, 4 }, { 7, 2 } };
        int[] r = getOrder(tasks1);
        for (int i : r)
            System.out.print(i + " ");
    }
}
