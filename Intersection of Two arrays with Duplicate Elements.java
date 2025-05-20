// } Driver Code Ends


class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> added = new HashSet<>();
        for (int num : a){
            map.put(num, 1);
        }
        for (int num : b) {
            if ( map.containsKey(num) &&!added.contains(num)) {
                result.add(num);
                added.add(num);
            }
        }
        return result;
    }
}
