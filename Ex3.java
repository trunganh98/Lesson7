package Exception;

public class Ex3 {
    public static void magic(int number) throws Exception {
        if (number == 8) {
            throw (new Exception("you hit the magic number"));
        }
        System.out.println("hello");
    }
}
