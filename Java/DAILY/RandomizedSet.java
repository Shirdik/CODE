package Java.DAILY;

import java.util.ArrayList;
import java.util.List;

public class RandomizedSet {

    private List<Integer> s;
    java.util.Random rand = new java.util.Random();

    public RandomizedSet() {
        this.s = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (s.contains(val))
            return false;
        else {
            s.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (s.contains(val)) {
            s.remove(val);
            return true;
        } else
            return false;

    }

    public int getRandom() {
        return s.get(rand.nextInt(s.size()));
    }

    public static void main(String[] args) {
        // ["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
        // [[],[1],[2],[2],[],[1],[2],[]]
        RandomizedSet r = new RandomizedSet();
        System.out.println(r.insert(1));
        System.out.println(r.remove(2));
        System.out.println(r.insert(2));
        System.out.println(r.getRandom());
        System.out.println(r.remove(1));
        System.out.println(r.insert(2));
        System.out.println(r.getRandom());
    }
}
