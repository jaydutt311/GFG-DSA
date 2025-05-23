class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        HashMap <String,Integer> map = new HashMap<>();
        int index = 0;
        for(int i = 0; i< arr.length; i++){
            char[] c = arr[i].toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!map.containsKey(sorted)){
                ArrayList<String> newList = new ArrayList<>();
                newList.add(arr[i]);
                result.add(newList);
                map.put(sorted,index);
                index++;
            }else{
                result.get(map.get(sorted)).add(arr[i]);
            }
        }
        return result;
    }
}
