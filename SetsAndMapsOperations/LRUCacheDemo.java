import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // Access-order mode enabled
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // Remove the eldest entry when the size exceeds capacity
    }
}

public class LRUCacheDemo {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println("Cache: " + cache);
        
        // Access key 1 to mark it as recently used
        cache.get(1);
        
        // Insert a new key, this will remove the least recently used (key 2)
        cache.put(4, "D");
        
        System.out.println("Updated Cache: " + cache);
    }
}
