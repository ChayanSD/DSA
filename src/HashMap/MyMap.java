package HashMap;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class MyMap<K,V> {
    private List<MapNode<K,V>> bucket; //this is bucket array .means List of linkedList.
    private int capacity;//length of the bucket;
    private int size;//Number of elements in the bucket;
    private final int INITIAL_CAPACITY = 5;//Default size;

    public MyMap() {
        bucket = new ArrayList<>();
        capacity = INITIAL_CAPACITY;
        for(int i = 0 ; i< capacity;i++){
            bucket.add(null);//This is a list that's reasons we initially put null at every index.
        }



    }

    private class MapNode<K,V>{
        K key;
        V value;

        public MapNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
