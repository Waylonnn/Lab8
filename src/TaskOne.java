import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = InputHelper.getNonZeroLenString(scan, "Please enter your username: ");
        System.out.println("The username you entered is: " + user);
    }
}