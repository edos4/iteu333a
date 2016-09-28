package regexmatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Regexmatch {

    public static boolean isTrue(String str) {
        return str.matches("[tT]rue");
    }

    public static boolean containsFalse(String str) {
        return str.matches(".*false.*");
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        System.out.println(isTrue("True"));
        System.out.println(containsFalse("kushfdskjdgf"));
        Scanner sc = new Scanner(new FileReader("input.txt"));

        //reads the file "input.txt"
        PrintWriter writer = new PrintWriter("Regexmatch.java", "UTF-8");

        while (sc.hasNext()) {
            String str = sc.nextLine();
            //replaces if to kung
            str = str.replaceAll("if", "kung");
            System.out.println(str);
        }
        Runtime rt = Runtime.getRuntime();
        rt.exec("javac " + System.getProperty("user.dir") + "\\out.java", null, new File("C:\\Program Files\\Java\\jdk1.8.0_71\\bin\\"));
        writer.close();

        String command = "javac.exe " + System.getProperty("user.dir") + "\\Regexmatch.java";
        try {
            Process p = Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
