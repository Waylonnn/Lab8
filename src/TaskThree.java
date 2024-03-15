import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        int day;
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan, "Enter the Year you were born in:", 1950, 2010);
        int month = InputHelper.getRangedInt(scan, "Enter the Month you were born in:", 1, 12);
        if(month == 9 || month == 4 || month == 6 || month == 11)
            day = InputHelper.getRangedInt(scan, "Enter the Day you were born on:", 1, 30);
        else if (month == 2)
            day = InputHelper.getRangedInt(scan, "Enter the Day you were born on:", 1, 29);
        else day = InputHelper.getRangedInt(scan, "Enter the Day you were born on:", 1, 31);

        int hour; InputHelper.getRangedInt(scan, "Enter the Hour you were born on:", 1, 24);
        int minute; InputHelper.getRangedInt(scan, "Enter the Minute you were born on:", 1, 59);
    }
}