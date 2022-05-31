package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtility {
    public static byte[] readBytes(String fileName) throws Exception {
        File file = new File(fileName);

        try (FileInputStream fileInputStream = new FileInputStream(file);) {

            byte[] bytesArray = new byte[(int) file.length()];

            //read file into bytes[]
            fileInputStream.read(bytesArray);
            return bytesArray;
        }
    }

    public static void writeBytes(String fileName, byte[] data) throws Exception {
        FileOutputStream fop = new FileOutputStream(fileName);
        // get the content in bytes
        fop.write(data);
        fop.flush();
        fop.close();

        System.out.println("Done");
    }
}
