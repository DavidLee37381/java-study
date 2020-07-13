package file;

import java.io.File;
import java.util.Date;

public class GetFileLastModified {
    public static void main(String[] args) {
        File file = new File("Main.java");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
