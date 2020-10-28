package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeMillis{
    public static void main(String[] args){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E HH:mm"); //2020-02-09 周四 11:00-12:00
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(System.currentTimeMillis()))));      // 时间戳转换成时间
        System.out.println("格式化结果：" + sd);

        SimpleDateFormat sdf3=new SimpleDateFormat("HH:mm"); //2020-02-09 周四 11:00-12:00
        String sd3 = sdf3.format(new Date(Long.parseLong(String.valueOf(System.currentTimeMillis()))));      // 时间戳转换成时间
        System.out.println("格式化结果：" + sd3);

        System.out.println("格式化结果：" + sd + " - " + sd3);

//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
//        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
//        System.out.println("格式化结果：" + sd2);
    }
}