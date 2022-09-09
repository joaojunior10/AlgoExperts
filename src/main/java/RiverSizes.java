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
                    int size = findRiverSize(matrix, visited, i, j, 1);
                    rivers.add(size);
                }
                visited[i][j] = 1;
            }
        }
        return rivers;
    }

    private static int findRiverSize(int[][] matrix, int[][] visited, int x, int y, int size) {
        visited[x][y] = 1;
        if (isAdjacentRiverTile(matrix, visited, x + 1, y)) {
            size = findRiverSize(matrix, visited, x + 1, y, size + 1);
        }
        if (isAdjacentRiverTile(matrix, visited, x - 1, y)) {
            size = findRiverSize(matrix, visited, x - 1, y, size + 1);
        }
        if (isAdjacentRiverTile(matrix, visited, x, y + 1)) {
            size = findRiverSize(matrix, visited, x, y + 1, size + 1);
        }
        if (isAdjacentRiverTile(matrix, visited, x, y - 1)) {
            size = findRiverSize(matrix, visited, x, y - 1, size + 1);
        }
        return size;
    }

    private static boolean isAdjacentRiverTile(int[][] matrix, int[][] visited, int x, int y) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (x < n && y < m && x >= 0 && y >= 0 && visited[x][y] == 0) {
            visited[x][y] = 1;
            return matrix[x][y] == 1;
        }
        return false;
    }
}
