package contents;

import java.io.File;

public class FileIsHidden {
    public static void main(String[] args) {
        File file = new File("C:/Demo.txt");
        System.out.println(file.isHidden());
    }
}
