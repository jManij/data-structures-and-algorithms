package hashtable;


public class Node <Key, Value> {
    Key key;
    Value value;

    /**
     * Reference to the next Node
     */
    Node <Key, Value> nextNode;

    /**
     * CONSTRUCTOR
     * @param k
     * @param v
     */
    public Node(Key k, Value v) {
        this.key = k;
        this.value = v;
    }

}
