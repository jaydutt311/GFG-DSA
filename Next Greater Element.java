class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            res.add(0, stack.isEmpty() ? -1 : stack.peek());
            stack.push(arr[i]);
        }
        return res;
    }
}
