package hashtable;


import java.util.ArrayList;

public class HashTable <Key, Value> {

    /**
     * Initial Variables
     */
    private ArrayList<Node <Key, Value>> arrayListOfBuckets;
    private int bucketCapacity;
    private int bucketSize;

    /**
     * CONSTRUCTOR
     */
    public HashTable() {
        arrayListOfBuckets = new ArrayList<>();
        bucketCapacity = 5;  //Initial capacity
        bucketSize = 0;

        for (int i = 0; i < bucketCapacity; i++)
            arrayListOfBuckets.add(null);
    }

    /**
     * Hashes the given key and returns the int value of the key
     * @param key
     * @return
     */
    private int hash(Key key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode) % bucketCapacity;
        return index;
    }

    /**
     * Gets a key and returns the value associated with the key
     * @param key
     * @return: value of the key
     */
    public Value get(Key key) {
        int index = hash(key);
        Node<Key, Value> temp = arrayListOfBuckets.get(index);
        while (temp != null)
        {
            if (temp.key.equals(key))
                return temp.value;
            temp = temp.nextNode;
        }

        // key is not found
        return null;

    }

    /**
     * Creates key-value pair based on the params
     * @param key
     * @param value
     */

    public void add(Key key, Value value) {
        int index = hash(key);

        Node<Key, Value> temp = arrayListOfBuckets.get(index);

        //Validate duplicate key
        while (temp != null) {
            if (temp.key.equals(key))
            {
                temp.value = value;
                return;
            }
            temp = temp.nextNode;
        }

        bucketSize++;
        temp = arrayListOfBuckets.get(index);
        Node<Key, Value> newTemp = new Node<Key, Value>(key, value);
        newTemp.nextNode = temp;
        arrayListOfBuckets.set(index, newTemp);

        //Check threshold to maintain overflow
        if ((1.0 * bucketSize) / bucketCapacity >= 0.5)
        {
            //Copy existing bucket to a temporary arraylist
            ArrayList<Node<Key, Value>> tempArrayListOfBuckets = arrayListOfBuckets;

            //Make a fresh copy of new Arraylist of buckets
            arrayListOfBuckets = new ArrayList<>();

            //Increase bucketsCapacity by double
            bucketCapacity = bucketCapacity * 2;
            bucketSize = 0;

            for (int i = 0; i < bucketCapacity; i++)
                arrayListOfBuckets.add(null);

            for (Node<Key, Value> node : tempArrayListOfBuckets)
            {
                while (node != null)
                {
                    add(node.key, node.value);
                    node = node.nextNode;
                }
            }
        }
    }


    /**
     * Checks if the key exists in the HashTable
     * @param key
     * @return: Boolean to show if the key exists
     */
    public boolean contains(Key key) {
        int hashKey = hash(key);
        Node<Key, Value> temp = arrayListOfBuckets.get(hashKey);

        return temp != null;
    }

    /**
     * Source Referenced: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/
     */

}

