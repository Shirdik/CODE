package Java.OTHER;

public class Reshape {

    public static int[][] reshape(int mat[][], int r, int c) {
        if (mat.length * mat[0].length != r * c)
            return mat;
        int[][] res = new int[r][c];
        int x = 0;
        int y = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (y == c) {
                    x++;
                    y = 0;
                }
                res[x][y] = mat[i][j];
                y++;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2 }, { 3, 4 } };
        int r = 1;
        int c = 4;
        int res[][] = reshape(mat, r, c);
        System.out.println(res);

    }
}
