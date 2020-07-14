package string;

public class SearchStringEmp {
//    public static void main(String[] args) {
//        String strOrig = "Google Runoob Taobao";
//        int intIndex = strOrig.indexOf("Runoob");
//        if(intIndex == - 1){
//            System.out.println("没有找到字符串 Runoob");
//        }else{
//            System.out.println("Runoob 字符串位置 " + intIndex);
//        }
//    }

    public static void main(String[] args) {
        String str = "Baidu Alibaba Tencent Baidu Alibaba Tencent";
        int intIndex = str.indexOf("Alibaba");
        if(intIndex == -1){
            System.out.println("没有字符串Alibaba");
        }else{
            System.out.println("Alibaba 字符串位置" + intIndex);
        }
    }
}
