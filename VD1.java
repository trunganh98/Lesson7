package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VD1 {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
