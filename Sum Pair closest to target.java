// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int left = 0, right = arr.length-1;
        while(left < right){
            int cur = arr[left] + arr[right];
            if(Math.abs(target - cur) < min){
            min = Math.abs(target - cur);
            list.clear();
            list.add(arr[left]);
            list.add(arr[right]);
            }
            if(cur > target){
                right--;
            }else if (cur < target){
            }else{
                return list;
            }
        }
        return list;
    }
}
