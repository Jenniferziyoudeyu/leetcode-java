package q370_379;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q378KthSmallestInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0
                || matrix.length * matrix[0].length < k || k <= 0) return -1;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return matrix[o1[0]][o1[1]] - matrix[o2[0]][o2[1]];
            }
        });
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] visited = new boolean[row][col];
        pq.offer(new int[]{0,0});
        visited[0][0] = true;

        while (!pq.isEmpty() && k > 1) {
            int[] poll = pq.poll();
            int x = poll[0];
            int y = poll[1];

            if (x + 1 < row && !visited[x + 1][y]) {
                pq.offer(new int[]{x + 1, y});
                visited[x+1][y] = true;
            }

            if (y + 1 < col && !visited[x][y + 1]) {
                pq.offer(new int[]{x, y + 1});
                visited[x][y + 1] = true;
            }
            k--;
        }
        //之前的数都不断poll出去 一共k次，所以现在pq.poll是当前pq最小的，是在整个matrix中第k小的
        return matrix[pq.poll()[0]][pq.poll()[1]];
    }
}
