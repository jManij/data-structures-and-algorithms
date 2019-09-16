package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {
    HashTable <String, Integer> ht1 = new HashTable<>();
    HashTable <String, String> ht2 = new HashTable<>();
    HashTable <Integer, Integer> ht3 = new HashTable<>();
    HashTable <Integer, String> ht4 = new HashTable<>();

    @Before
    public void init() {
        ht1.add("Apple", 1);
        ht1.add("Banana", 2);
        ht1.add("Orange", 3);
    }

    @Test
    public void get() {
        assertTrue("The method should return the value for the key", ht1.get("Apple").equals(1));
        assertTrue("The method should return the value for the key", ht1.get("Banana").equals(2));
        assertTrue("The method should return the value for the key", ht1.get("Orange").equals(3));

    }

    @Test
    public void add() {
        ht1.add("newkey", 5);
        ht1.add("anothernew", 6);

        assertTrue("The method should return the value for the key", ht1.get("newkey").equals(5));
        assertTrue("The method should return the value for the key", ht1.get("anothernew").equals(6));

    }

    @Test
    public void contains() {
        assertTrue("The method should return true for the key that has value", ht1.contains("Apple"));
        assertTrue("The method should return true for the key that has value", ht1.contains("Orange"));
        assertTrue("The method should return true for the key that has value", ht1.contains("Banana"));
        assertTrue("The method should return false for the key that has value", !ht1.contains("newkeyssss"));

    }

}