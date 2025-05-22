class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet <Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int max = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num, count = 1;
                while(set.contains (currentNum + 1)){
                    count++;
                    currentNum++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
