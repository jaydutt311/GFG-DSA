class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxDist = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                int dist = i - map.get(arr[i]);
                maxDist = Math.max(maxDist, dist);
            }
        }
        return maxDist;
    }
}
