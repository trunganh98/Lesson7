package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");
        try {
            Scanner in = new Scanner(new File("test.in"));

            System.out.println(1 / 0);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()");
    }
}
