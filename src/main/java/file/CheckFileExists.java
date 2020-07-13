package file;

import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        File file = new File("C:/java.txt");
        System.out.println(file.exists());
    }
}
