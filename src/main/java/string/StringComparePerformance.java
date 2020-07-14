package string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringComparePerformance {
//        public static void main(String[] args){
//        long startTime = System.currentTimeMillis();
//        for(int i=0;i<50000;i++){
//            String s1 = "hello";
//            String s2 = "hello";
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("通过 String 关键词创建字符串"
//                + " : "+ (endTime - startTime)
//                + " 毫秒" );
//        long startTime1 = System.currentTimeMillis();
//        for(int i=0;i<50000;i++){
//            String s3 = new String("hello");
//            String s4 = new String("hello");
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("通过 String 对象创建字符串"
//                + " : " + (endTime1 - startTime1)
//                + " 毫秒");
//    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Date startDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        for (int i = 0; i < 999999999; i++) {
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        Date endDate = new Date();
        System.out.println("开始时间：" + startTime);
        System.out.println("开始时期：" + startDate);
        System.out.println("开始时期：" + simpleDateFormat.format(startDate));
        System.out.println("结束时间：" + endTime);
        System.out.println("结束时期：" + endDate);
        System.out.println("结束时期：" + simpleDateFormat.format(endDate));
        System.out.println("创建关键字" + ":" + (endTime - startTime) + "毫秒");


        long startTime1 = System.currentTimeMillis();
        Date startDate1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyyMMddHHmmss");
        for (int i = 0; i < 999999999; i++) {
            String s1 = new String("hello");
            String s2 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        Date endDate1 = new Date();
        System.out.println("开始时间：" + startTime1);
        System.out.println("开始时期：" + startDate1);
        System.out.println("开始时期：" + simpleDateFormat1.format(startDate1));
        System.out.println("结束时间：" + endTime1);
        System.out.println("结束时期：" + endDate1);
        System.out.println("结束时期：" + simpleDateFormat.format(endDate1));
        System.out.println("创建关键字" + ":" + (endTime1 - startTime1) + "毫秒");
    }

}
