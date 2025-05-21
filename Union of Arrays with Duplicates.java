// User function Template for Java

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet < Integer > set= new    HashSet();
        for(int num: a){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        for(int num: b){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        return set.size();
    }
}
