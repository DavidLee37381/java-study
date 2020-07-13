package file;

import java.io.File;

public class CreateTempFilePath {
    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File("C:/");
        file = File.createTempFile
                ("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}
