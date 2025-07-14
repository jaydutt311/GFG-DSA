class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>( (a, b) -> distance(b) - distance(a));
        for ( int[] point : points){
            maxHeap.offer(point);
            if (maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int[][] result =  new int[k][2];
        int i = 0;
        for (int[] point : maxHeap){
            result[i++] = point;
        }
        return result;
    }
    private int distance(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
}
