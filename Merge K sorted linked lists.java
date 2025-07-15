/*class Node
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

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
            public int compare(Node a, Node b){
                return a.data - b.data;
            }
            });
            for (Node node : arr) {
                if (node != null) {
                    pq.add(node);
                }
            }
            Node dummy = new Node(0);
            Node tail = dummy;
            while  (!pq.isEmpty()) {
                Node minNode = pq.poll();
                tail.next = minNode;
                tail = tail.next;
                if (minNode.next != null){
                    pq.add(minNode.next);
                }
            }
            return dummy.next;
        }
    }
