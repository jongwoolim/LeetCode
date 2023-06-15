class Solution {
    
    int answer = 0;
    public int numRookCaptures(char[][] board) {
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == 'R') {

                    queue.offer(new Point(i, j, -1, 0));
                    queue.offer(new Point(i, j, 1, 0));
                    queue.offer(new Point(i, j, 0, -1));
                    queue.offer(new Point(i, j, 0, 1));

                    break;
                }
            }
        }

        while (!queue.isEmpty()) {

            Point visitedPoint = queue.poll();

            int nx = visitedPoint.x + visitedPoint.dx;
            int ny = visitedPoint.y + visitedPoint.dy;

            if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8 && board[nx][ny] == 'p') {
                answer++;
            } else if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8 && board[nx][ny] != 'B') {
                queue.offer(new Point(nx, ny, visitedPoint.dx, visitedPoint.dy));
            }
        }

        return answer;
    }

    
    static class Point {
        int x;
        int y;
        int dx;
        int dy;

        public Point(int x, int y, int dx, int dy) {
            this.x = x;
            this.y = y;
            this.dx = dx;
            this.dy = dy;
        }
    }
}