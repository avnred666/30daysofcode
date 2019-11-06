package ThirtyDaysOfCode;

import java.util.Scanner;

public class Main {

    public static void fnDayone() {
        DayOne obj = new DayOne();
        String getString = obj.getInput();
        obj.printOutput(getString);
    }

    public static void fnDayTwo() {
        DayTwo obj = new DayTwo();
        obj.scanAndPrint(4, 4.0, "HackerRank ");
    }

    public static void fnDayThree() {
        DayThree obj = new DayThree();
        obj.getInput();
    }

    public static void fnDayFour() {
        DayFour obj = new DayFour();
        obj.conditionCheck();
    }
    private static void fnDayFive() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            DayFive p = new DayFive(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }


    public static void main(String[] args) {
//       fnDayone();
//       fnDayTwo();
//       fnDayThree();
//       fnDayFour();
         fnDayFive();
    }

}
