/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
     PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
     for (Node head : arr) {
         if (head != null) {
             pq.offer(head);
         }
     }
     
     Node dummy = new Node(0);
     Node tail = dummy;
     
     while (!pq.isEmpty()) {
      Node smallest = pq.poll();
      tail.next = smallest;
      tail = tail.next;
      if (smallest.next != null) {
          pq.offer(smallest.next);
      }
     }
     return dummy.next;
    }
}
