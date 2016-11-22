import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
        static File f;
        public static void main(String[] args) throws IOException {
                    File  file=new File("java1.txt");
                    file.createNewFile();
                    FileOutputStream outputStream = new FileOutputStream(file);
                    String s="hello world!";
                    outputStream.write(s.getBytes());
                    outputStream.close();
                     getAllTextFromFile(file);

                }
    public static void getAllTextFromFile(File o) throws IOException{
            f=o;
        FileInputStream input = new FileInputStream(f);
            Scanner scn = new Scanner(input);
        System.out.println(scn.nextLine());

    }

        }







