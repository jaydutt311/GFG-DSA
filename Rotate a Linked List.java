/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        Node temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        k = k % length;
        if(k == 0) return head;
        temp.next = head;
        temp = head;
         Node prev = null;
         for( int i = 0; i < k; i++){
             prev = temp;
             temp = temp.next;
         }
         prev.next = null;
         return temp;
    }
}
