package sample;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SaveTo(path = "str.txt")
public class TextContainer {
    private String str = "Save this string";

    @Saver
    public void save(String path) {

        try (PrintWriter pw = new PrintWriter(path)) {
            pw.println(str);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR FILE WRITE");
        }

    }

}
