package Java.DAILY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pos {
    int[] pos = new int[2];

    public Pos(int x, int y) {
        this.pos[0] = x;
        this.pos[1] = y;
    }

    public int[] getPos() {
        return pos;
    }

    public boolean isConnected(Pos p1) {
        return Math.abs(this.pos[0] - p1.pos[0]) < 2 && Math.abs(this.pos[1] - p1.pos[1]) < 2
                && !(Math.abs(this.pos[1] - p1.pos[1]) == Math.abs(this.pos[0] - p1.pos[0]));
    }

    @Override
    public String toString() {
        return Arrays.toString(pos);
    }

}

public class WordSearch2 {

    public static Map<Character, List<Pos>> mapGen(char[][] board) {

        Map<Character, List<Pos>> p = new HashMap<>();
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                List<Pos> temp = new ArrayList<>();
                temp.add(new Pos(i, j));
                if (p.get(Character.valueOf(board[i][j])) != null)
                    temp.addAll(p.get(Character.valueOf(board[i][j])));
                p.put(Character.valueOf(board[i][j]), temp);
            }
        return p;

    }

    public static boolean find(Map<Character, List<Pos>> p, String word) {
        char[] c = word.toCharArray();
        int connected = 0;
        List<Pos> x, y = new ArrayList<>();
        if (word.length() < 2)
            return p.containsKey(Character.valueOf(word.charAt(0)));
        for (int i = 0; i < word.length() - 1; i++) {
            if (p.get(Character.valueOf(c[i])) == null || p.get(Character.valueOf(c[i + 1])) == null)
                return false;
            x = p.get(Character.valueOf(c[i]));
            y = p.get(Character.valueOf(c[i + 1]));
            int temp = connected;
            for (Pos p1 : x) {
                for (Pos p2 : y)
                    if (p1.isConnected(p2)) {
                        connected++;
                        break;
                    }
            }
            if (temp == connected)
                return false;
        }
        return true;
    }

    public static List<String> findWords1(char[][] board, String[] words) {
        List<String> o = new ArrayList<>();
        Map<Character, List<Pos>> p = mapGen(board);
        System.out.println(p);
        for (String s : words)
            if (find(p, s))
                o.add(s);
        return o;

    }

    public static void main(String[] args) {
        char[][] board1 = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
                { 'i', 'f', 'l', 'v' } };
        String[] words1 = { "oath", "pea", "eat", "rain" };
        char[][] board2 = { { 'a', 'b' }, { 'c', 'd' } };
        String[] words2 = { "abcd" };
        char[][] board3 = { { 'a', 'a' } };
        String[] words3 = { "aaa" };
        // System.out.println(findWords1(board1, words1));
        // System.out.println(findWords1(board2, words2));
        System.out.println(findWords1(board3, words3));
    }

}
