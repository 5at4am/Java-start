import java.util.PriorityQueue;

public class soldier {
    static class row implements Comparable<row> {
        int count;
        int idx;

        public row(int count, int idx) {
            this.count = count;
            this.idx = idx;
        }

        @Override
        public int compareTo(row r2) {
            if (this.count == r2.count) {
                return this.idx - r2.idx;
            } else {
                return this.count - r2.count;
            }
        }
    }

    public static void main(String[] args) {
        int[][] army = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };
        int k = 2;

        PriorityQueue<row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[i].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println(pq.remove().idx);
            
        }
    }
}