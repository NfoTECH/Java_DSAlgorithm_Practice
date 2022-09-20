package hashMapTesting;

import java.util.*;
// Do not edit the class below except for the insertKeyValuePair,
// getValueFromKey, and getMostRecentKey methods.
// Feel free to add new properties and methods to the class.
public class LruCache {
    static class LRUCache {
        int maxSize;
        String mostRecentlyUsed;
        HashMap<String,Integer> cache = new HashMap<>();
        ArrayList<String> store = new ArrayList<>();
        public LRUCache(int maxSize) {
            this.maxSize = maxSize > 1 ? maxSize : 1;
        }
        public void insertKeyValuePair(String key, int value) {
            // Write your code here.
            if(cache.size() < maxSize){
                store.add(key);
                cache.put(key,value);
            }else if(cache.size() == maxSize){
                if(cache.containsKey(key)){
                    int val = cache.get(key);
                    cache.replace(key,val,value);
                    store.remove(key);
                    store.add(key);
                }else{
                    String oldKey = store.get(0);
                    store.remove(oldKey);
                    store.add(key);
                    cache.remove(oldKey);
                    cache.put(key,value);
                }
            }
        }
        public LRUResult getValueFromKey(String key) {
            // Write your code here.
            if(cache.containsKey(key)){
                store.remove(key);
                store.add(key);
                return new LRUResult (true,cache.get(key));
            }else{
                return new LRUResult(false,null);
            }
        }
        public String getMostRecentKey() {
            // Write your code here.
            return store.get(store.size()-1);
        }
    }
    static class LRUResult {
        boolean found;
        Integer value;
        public LRUResult(boolean found, Integer value) {
            this.found = found;
            this.value = value;
        }
    }
}
