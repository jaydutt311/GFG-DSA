/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if (head == null || k <= 1) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupTail = dummy;
        Node current = head;
        while (current != null){
            Node temp = current;
            int count = 0;
            while (count < k && temp != null){
                temp = temp.next;
                count++;
            }
            Node groupHead = current;
            Node prev = null;
            Node next = null;
            int i = 0;
            while(i < count && current != null){
                next = current.next;
                current.next = prev;
                current = next;
                i++;
            }
            prevGroupTail.next = prev;
            groupHead.next = current;
            prevGroupTail= groupHead;
        }
        return dummy.next;
    }
}
