import java.util.*;

class LFUCache {
class Node {
    int key, value , freq;
    Node prev, next;
    Node(int k, int v) {
        key = k;
        value = v;
        freq = 1;
    }
}

class DLList {
    Node head, tail;
    int size;
    
    DLList(){
        head = new Node (0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    
     void addFirst (Node node) {
         node.next = head.next;
         node.prev = head;
         head.next.prev = node;
         head.next = node;
         size++;
     }
     
     void remove(Node node) {
         if (node == head || node == tail) return;
         node.prev.next = node.next;
         node.next.prev = node.prev;
         node.prev = null;
         node.next = null;
         size--;
     }
     
      Node removeLast() {
          if (size == 0) return null;
              Node last = tail.prev;
              remove(last);
              return last;
      } 
}

int capacity, minFreq;
Map<Integer, Node> keyMap = new HashMap<>();
Map<Integer, DLList> freqMap = new HashMap<>();

    public LFUCache(int cap) {
        // code here
       capacity = cap;
        minFreq = 0;
      
    }
    
    public int get(int key) {
        
        // code here
        if (!keyMap.containsKey(key)) return - 1;
        Node node = keyMap.get(key);
           updateFreq(node);
            return node.value;
        }
        
    public void put(int key, int value) {
        // code here
        if (capacity == 0) return;
        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            node.value = value;
            updateFreq(node);
            return;
        }
        
        if (keyMap.size() == capacity) {
            DLList minList = freqMap.get(minFreq);
            Node removed = minList.removeLast();
            keyMap.remove(removed.key);
        }
        
        Node node = new Node(key, value);
        keyMap.put(key, node);
        minFreq = 1;
        freqMap.putIfAbsent(1, new DLList());
        freqMap.get(1).addFirst(node);
    }
    
    private void updateFreq(Node node) {
        int oldFreq = node.freq;
        DLList oldList = freqMap.get(oldFreq);
       
        oldList.remove(node);
        
        if (oldFreq == minFreq && oldList.size == 0) {
            minFreq++;
        }
        node.freq++;
        freqMap.putIfAbsent(node.freq, new DLList());
        freqMap.get(node.freq).addFirst(node);
    }
}
