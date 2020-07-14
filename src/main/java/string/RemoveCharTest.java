package string;

public class RemoveCharTest {
//    public static void main(String args[]) {
//        String str = "this is Java";
//        System.out.println(removeCharAt(str, 3));
//    }
//    public static String removeCharAt(String s, int pos) {
//        return s.substring(0, pos) + s.substring(pos + 1);
//    }

    public static void main(String[] args) {
        String str = "this is dogge";
        System.out.println(removeChar(str, 5));
    }
    public static String removeChar(String s, int pos){
        return s.substring(0,pos) + s.substring(pos + 1);
    }
}
