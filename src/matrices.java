public class matrices {
    public static void main(String[] args) {
        int[][] m = {
                {10, 20, 30},
                {1},
                {-1, -2, -3, -4},
                {3, 2, 1}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%02d ", m[i][j]);
            }
            System.out.println();
        }
    }
}
