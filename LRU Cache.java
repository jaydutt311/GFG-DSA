class LRUCache {
private int capacity;
private Map<Integer, Integer> cacheMap;
private LinkedList<Integer> lruList;
    LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.lruList = new LinkedList<>();
    }
    public int get(int key) {
    if (!cacheMap.containsKey(key)) {
        return -1;
    }
    lruList.remove(Integer.valueOf(key));
    lruList.addFirst(key);
    return cacheMap.get(key);
    }
    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            cacheMap.put(key,value);
            lruList.remove(Integer.valueOf(key));
        }
        else {
            if (cacheMap.size() >= capacity){
                int leastUsedKey = lruList.removeLast();
                cacheMap.remove(leastUsedKey);
            }
            cacheMap.put(key, value);
        }
        lruList.addFirst(key);
    }
}
