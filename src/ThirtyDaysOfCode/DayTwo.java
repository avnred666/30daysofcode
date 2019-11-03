package ThirtyDaysOfCode;

import java.util.Scanner;

public class DayTwo {

    public void scanAndPrint(int i, double d, String s) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int, double and string in the next three lines");
        int j = scan.nextInt();
        double e = scan.nextDouble();
        scan.nextLine();
        String t = scan.nextLine();

        System.out.println(i + j);
        System.out.println(d + e);
        System.out.println(s + t);

        scan.close();
    }


}
