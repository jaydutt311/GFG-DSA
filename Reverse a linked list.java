// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        // code here
    Node prev = null;
    Node curr = head;
    Node next = head.next;
    while(curr != null){
        curr.next = prev;
        prev = curr;
        curr = next;
        if(curr != null){
            next = curr.next;
        }
    }
    return prev;
    }
}
