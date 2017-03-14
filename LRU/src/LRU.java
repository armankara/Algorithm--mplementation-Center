import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Map;
import java.util.List;


/**
 *
 *  linkedhashmap
 */
public class LRU<K,V> extends LinkedHashMap<K,V>{

    private int maxSize;

    // private static final long serialVersionUID = 1L;

    public LRU(int size){
        super(size +1, 1, true);
        maxSize = size;

    }

    @Override
    protected boolean removeEldestEntry(Entry<K, V> eldest){

        return size() > maxSize;
    }

    public static void main(String[] args){

        LRU<String, Integer> lru = new LRU<String, Integer>(2);

        lru.put("A", 1);
        lru.put("B", 2);

        lru.put("C", 3);
        if(lru.containsKey("A"))
            System.out.println("LRU is failed");
        else
            System.out.println("Yes : " + lru.size());


    }
}
