class LRUCache {

    public int cap;
    public Map<Integer, Integer> LRU;
    public Queue<Integer> keys = new ArrayDeque<>();

    public LRUCache(int capacity) {
        LRU = new HashMap<>();
        cap = capacity;
    }
    
    public int get(int key) {
        if (LRU.containsKey(key)) {
            keys.remove(key);
            keys.offer(key);
            return LRU.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(LRU.containsKey(key)) {
            keys.remove(key);
        }
        else if (LRU.size() >= cap) {
            LRU.remove(keys.poll());
        }
        keys.offer(key);
        LRU.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */