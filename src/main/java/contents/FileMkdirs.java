package contents;

import java.io.File;

public class FileMkdirs {
    public static void main(String[] args) {
        String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}
