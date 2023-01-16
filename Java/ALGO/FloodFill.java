package Java.ALGO;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r = image.length, c = image[0].length;
        dfs(image, sr, sc, r, c, image[sr][sc], color);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int r, int c, int color, int newColor) {
        if (sr < 0 || sr >= r || sc < 0 || sc >= c || image[sr][sc] == newColor || image[sr][sc] != color)
            return;
        image[sr][sc] = newColor;
        dfs(image, sr + 1, sc, r, c, color, color);
        dfs(image, sr, sc + 1, r, c, color, color);
        dfs(image, sr - 1, sc, r, c, color, color);
        dfs(image, sr, sc - 1, r, c, color, color);
    }
}
