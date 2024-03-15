import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = InputHelper.getInt(scan, ("Enter your favorite int: "));
        double doub = InputHelper.getDouble(scan, ("Enter your favorite double: "));
        System.out.println("Your favorite int is " + num + " and your favorite double is " + doub + ".");
    }
}