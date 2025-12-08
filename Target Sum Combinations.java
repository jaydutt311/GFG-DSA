class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(arr, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] arr, int target, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (index == arr.length) return;
        if (arr[index] <= target) {
            current.add(arr[index]);
            backtrack(arr, target - arr[index], index, current, result);
            current.remove(current.size() - 1);
        }
        backtrack(arr, target, index + 1, current, result);
    }
}
