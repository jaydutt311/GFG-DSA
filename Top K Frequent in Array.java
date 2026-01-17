import java.util.*;
class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>( 
            (a, b) -> {
                if (a[1] != b[1]) {
                return b[1] - a[1];
                } else {
                return b[0] - a[0];
            }
            }
            );
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
                pq.offer(new int[] {entry.getKey(), entry.getValue()});
            }
            for (int i= 0; i< k; i++) {
                result.add(pq.poll()[0]);
            }
            return result;
    }
}
