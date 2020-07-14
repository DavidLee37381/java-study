package string;

public class StringConcatenate {
//    public static void main(String[] args){
//        long startTime = System.currentTimeMillis();
//        for(int i=0;i<5000;i++){
//            String result = "This is"
//                    + "testing the"
//                    + "difference"+ "between"
//                    + "String"+ "and"+ "StringBuffer";
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("字符串连接"
//                + " - 使用 + 操作符 : "
//                + (endTime - startTime)+ " ms");
//        long startTime1 = System.currentTimeMillis();
//        for(int i=0;i<5000;i++){
//            StringBuffer result = new StringBuffer();
//            result.append("This is");
//            result.append("testing the");
//            result.append("difference");
//            result.append("between");
//            result.append("String");
//            result.append("and");
//            result.append("StringBuffer");
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("字符串连接"
//                + " - 使用 StringBuffer : "
//                + (endTime1 - startTime1)+ " ms");
//    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            String str = "This is" + "testing the" + "difference" + "between" + "String" + "and" + "String";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字符串连接时使用操作符花费了" + (endTime - startTime) + "ms");
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            StringBuilder result = new StringBuilder();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuilder");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("字符串连接" + "使用StringBuilder" + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("字符串连接" + "使用StringBuffer" + (endTime2 - startTime2) + "ms");

    }
}
