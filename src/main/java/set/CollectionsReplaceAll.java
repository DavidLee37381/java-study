package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsReplaceAll {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :"+list);
        Collections.replaceAll(list, "one", "hundrea");
        System.out.println("replaceAll: " + list);
    }
}
