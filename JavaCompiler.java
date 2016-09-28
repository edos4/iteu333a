package regexmatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Regexmatch {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        Scanner sc = new Scanner(new FileReader("input.txt"));

        //reads the file "input.txt"
        PrintWriter writer = new PrintWriter("Test.java", "UTF-8");

        while (sc.hasNext()) {
            String str = sc.nextLine();
            //replaces kung with if
            str = str.replaceAll("kung", "if");
            writer.println(str);
        }
        Runtime rt = Runtime.getRuntime();
        rt.exec("javac " + System.getProperty("user.dir") + "\\Test.java", null, new File("C:\\Program Files\\Java\\jdk1.8.0_71\\bin\\"));
        writer.close();

        String command = "javac.exe " + System.getProperty("user.dir") + "\\Test.java";
        try {
            Process p = Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
