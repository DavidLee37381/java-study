package string;

public class StringReverseExample {
//    public static void main(String[] args){
//        String string="runoob";
//        String reverse = new StringBuffer(string).reverse().toString();
//        System.out.println("字符串反转前:"+string);
//        System.out.println("字符串反转后:"+reverse);
//    }

    public static void main(String[] args) {
        String str = "wowowowowo";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("原字符串" + str);
        System.out.println("反转后" + reverse);
    }
}
