package Java;

public class Search2DMatrix {

    public static boolean search2D(int[][] matrix, int target) {
        if (target > matrix[matrix.length - 1][matrix[0].length - 1])
            return false;
        if (matrix[0][0] == target)
            return true;
        int r = matrix.length;
        int c = matrix[0].length;
        int mid = (r * c) / 2;
        int l = 0;
        int h = (r * c) - 1;
        while (l <= h) {

            if (matrix[mid / c][(mid % c)] == target)
                return true;
            else if (matrix[mid / c][(mid % c)] > target) {
                h = mid - 1;
            } else
                l = mid + 1;

            mid = l + (h - l) / 2;

        }

        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3, 5 } };
        System.out.println(search2D(arr, 1));
    }
}
