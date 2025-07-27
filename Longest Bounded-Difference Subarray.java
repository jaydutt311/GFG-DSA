class Solution {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        int n = arr.length;
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        int start = 0, maxLen = 0, bestStart = 0;
        for (int end = 0; end < n; end++) {
            while (!maxDeque.isEmpty() && arr[maxDeque.peekLast()] < arr[end]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(end);
            while (!minDeque.isEmpty() &&arr[minDeque.peekLast()] > arr[end]) {
                minDeque.pollLast();
            }
            minDeque.addLast(end);
            while (arr[maxDeque.peek()] - arr[minDeque.peek()] > x) {
                if ( maxDeque.peek() == start) maxDeque.poll();
                if ( minDeque.peek() == start) minDeque.poll();
                start++;
            }
            if (end - start + 1> maxLen) {
                maxLen = end - start + 1;
                bestStart = start;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = bestStart; i < bestStart + maxLen; i++){
            result.add(arr[i]);
        }
        return result;
    }
}
