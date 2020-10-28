package arrays;

import java.util.ArrayList;

public class ArrayContains {
    public static void main(String[] args)  {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add("common1");
        objArray2.add("common2");
        objArray2.add("notcommon");
        objArray2.add("notcommon1");
        objArray.add("common1");
        objArray.add("common2");
        System.out.println("objArray 的数组元素："+objArray);
        System.out.println("objArray2 的数组元素："+objArray2);
        System.out.println("objArray 是否包含字符串common2? ： "
                +objArray.contains("common2"));
        System.out.println("objArray2 是否包含数组 objArray? ："
                +objArray2.contains(objArray) );
    }
}
