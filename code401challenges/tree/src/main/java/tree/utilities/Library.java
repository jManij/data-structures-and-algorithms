package tree.utilities;

import tree.BinaryTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library{

    public <E> ArrayList findIntersection(BinaryTree t1, BinaryTree t2) {
        ArrayList<E> itemsInTree1 = t1.inOrder(t1.root, new ArrayList<E>());
        ArrayList<E> itemsInTree2 = t2.inOrder(t2.root, new ArrayList<E>());
        ArrayList<E> finalIntersectionSet = new ArrayList<>();

        for(int i = 0; i < itemsInTree1.size(); i++) {
            if(itemsInTree2.contains(itemsInTree1.get(i)))
                finalIntersectionSet.add(itemsInTree1.get(i));
        }
        return finalIntersectionSet;
    }


}
