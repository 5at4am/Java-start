import java.util.*;

public class car {

    static class point implements Comparable<point> {
        int x;
        int y;
        int dis;
        int idx;

        public point(int x, int y, int dis, int idx) {
            this.dis = dis;
            this.x = x;
            this.y = y;
            this.idx = idx;
        }

        @Override
        public int compareTo(point p2) {
            return this.dis - p2.dis;
        }

    }

    public static void main(String[] args) {
        int[][] pts = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int sq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new point(pts[i][0], pts[i][1], sq, i));

        }
        for (int i = 0; i < pts.length; i++) {
            System.out.println("c " + pq.peek().dis + " " + pq.peek().x + " " + pq.peek().y + " "+  pq.peek().idx);
            pq.poll();

        }
    }
}