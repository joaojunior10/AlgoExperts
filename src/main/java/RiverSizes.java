import java.util.ArrayList;
import java.util.List;

public class RiverSizes {
    public static List<Integer> riverSizes(int[][] matrix) {
        // Write your code here.
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] visited = new int[n][m];
        List<Integer> rivers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1 && visited[i][j] == 0) {
                    int size = findRiverSize(matrix, visited, n, m, i, j, 1);
                    rivers.add(size);
                }
                visited[i][j] = 1;
            }
        }
        return rivers;
    }

    private static int findRiverSize(int[][] matrix, int[][] visited, int n, int m, int x, int y, int size) {
        visited[x][y] = 1;
        if (x + 1 < n && visited[x + 1][y] == 0) {
            visited[x + 1][y] = 1;
            if (matrix[x + 1][y] == 1) {
                size = findRiverSize(matrix, visited, n, m, x + 1, y, ++size);
            }
        }
        if (x - 1 > 0 && visited[x - 1][y] == 0) {
            visited[x - 1][y] = 1;
            if (matrix[x - 1][y] == 1) {
                size = findRiverSize(matrix, visited, n, m, x - 1, y, ++size);
            }
        }
        if (y + 1 < m && visited[x][y + 1] == 0) {
            visited[x][y + 1] = 1;
            if (matrix[x][y + 1] == 1) {
                size = findRiverSize(matrix, visited, n, m, x, y + 1, ++size);
            }
        }
        if (y - 1 > 0 && visited[x][y - 1] == 0) {
            visited[x][y - 1] = 1;
            if (matrix[x][y - 1] == 1) {
                size = findRiverSize(matrix, visited, n, m, x, y - 1, ++size);
            }
        }
        return size;
    }
}
