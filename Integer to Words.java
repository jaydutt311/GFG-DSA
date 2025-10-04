// User function Template for Java
class Solution {
    String[] below20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
    "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        
    };
   String[] tens = {
       "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
       
   };
   String[] thousands = {
       "", "Thousand", "Million", "Billion"
       
   };
   
    String convertToWords(int n) {
        // code here
    if (n == 0 ) return "Zero";
    String res = "";
    int i = 0;
    while (n > 0){
        if (n % 1000 != 0){
            String part = helper(n % 1000);
            res = part + (thousands[i].isEmpty() ? "" : " " + thousands[i]) + 
        (res.isEmpty() ? "" : " " + res);
        }
        n /= 1000;
        i++;
    }
    return res.trim();
    }
    String helper(int num){
        if (num == 0) return "";
        if (num < 20) return below20[num];
        if (num < 100) 
        return tens[num / 10] + (num % 10 != 0 ? " " + helper(num % 10) : "");
        return below20[num / 100] + " Hundred" + (num % 100 != 0 ? " " + helper(num % 100) : "");
    }
}
