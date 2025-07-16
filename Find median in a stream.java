class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        ArrayList<Double> medians = new   ArrayList<>();
        PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> high = new PriorityQueue<>();
        for (int num : arr){
            low.offer(num);
            high.offer(low.poll());
            if (high.size() > low.size()){
                low.offer(high.poll());
            }
            if (low.size() > high.size()){
                medians.add((double) low.peek());
            } else {
                medians.add((low.peek() + high.peek()) / 2.0);
            }
        }
        return medians;
    }
}
