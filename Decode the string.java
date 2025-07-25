
class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10  + (ch - '0');
            }else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new  StringBuilder();
                k = 0;
            }else if (ch ==']') {
                int count = countStack.pop();
                StringBuilder decodedPart = new StringBuilder(stringStack.pop());
                for (int i = 0; i < count; i++) {
                    decodedPart.append(currentString);
                }
                currentString = decodedPart;
        }else {
            currentString.append(ch);
        }
    }
    return currentString.toString();
}
}
