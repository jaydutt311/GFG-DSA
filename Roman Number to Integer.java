class Solution {
    public int romanToDecimal(String s) {
        // code here
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;
       int total = 0;
       int n = s.length();
       for (int i = 0; i < n; i++) {
           int curr = values[s.charAt(i) - 'A'];
           if (i + 1 < n && curr < values[s.charAt(i + 1) -'A']) {
               total -= curr;
           } else {
               total += curr;
           }
       }
       return total;
    }
}
