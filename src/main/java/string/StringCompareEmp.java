package string;

public class StringCompareEmp{
//    public static void main(String args[]){
//        String str = "Hello World";
//        String anotherString = "hello world";
//        Object objStr = str;
//
//        System.out.println( str.compareTo(anotherString) );
//        System.out.println( str.compareToIgnoreCase(anotherString) );  //忽略大小写
//        System.out.println( str.compareTo(objStr.toString()));
//    }

    public static void main(String[] args) {
        String str = "Hello Rose";
        String str2 = "hello rose";
        Object objStr = str;

        System.out.println( str.compareTo(str2));
        System.out.println( str.compareToIgnoreCase(str2));
        System.out.println( str.compareTo(objStr.toString()));
    }
}