package ThirtyDaysOfCode;

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

    public static void main(String[] args) {
        fnDayone();
        fnDayTwo();
    }


}
