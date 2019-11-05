package ThirtyDaysOfCode;

import java.util.Scanner;

public class DayFour {
    private static final Scanner scan = new Scanner(System.in);
    public void conditionCheck (){
        System.out.println("Enter N");
        int N = scan.nextInt();

        if ((N%2!=0)||((N>=6)&&(N<=20)))
        {
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }
        scan.close();
    }

}
