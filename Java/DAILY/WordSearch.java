package Java.DAILY;

public class WordSearch {

    static boolean visited[][];

    public static boolean exist(char[][] board, String word) {

        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) == board[i][j] && find(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private static boolean find(char[][] board, String word, int i, int j, int k) {
        if (k == word.length())
            return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(k)
                || visited[i][j])
            return false;
        visited[i][j] = true;
        if (find(board, word, i + 1, j, k + 1) || find(board, word, i, j + 1, k + 1)
                || find(board, word, i - 1, j, k + 1)
                || find(board, word, i, j - 1, k + 1))
            return true;
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char board[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        System.out.println(exist(board, "ABCCED"));
    }
}
