package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class VD2 {
    public static void main(String[] args) throws FileNotFoundException
    {
        try {

            Scanner in = new Scanner(new File("test.in"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {

        } finally {

        }
    }
}
