package dataStructure;

import java.util.Collections;
import java.util.Vector;

public class CollectionsSortTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "M");
        System.out.println("元素索引值为 : " + index);
    }
}
