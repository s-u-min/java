class Solution {
    private static class Point {
        final long x, y;
        Point(int[] dot) {
            this.x = dot[0];
            this.y = dot[1];
        }
    }

    public int solution(int[][] dots) {
        Point a = new Point(dots[0]);
        Point b = new Point(dots[1]);
        Point c = new Point(dots[2]);
        Point d = new Point(dots[3]);

        if (isParallel(a, b, c, d)) return 1;
        if (isParallel(a, c, b, d)) return 1;
        if (isParallel(a, d, b, c)) return 1;

        return 0;
    }

    private boolean isParallel(Point p1, Point p2, Point p3, Point p4) {
        long dy1 = p2.y - p1.y;
        long dx1 = p2.x - p1.x;
        long dy2 = p4.y - p3.y;
        long dx2 = p4.x - p3.x;

        return dy1 * dx2 == dy2 * dx1;
    }
}