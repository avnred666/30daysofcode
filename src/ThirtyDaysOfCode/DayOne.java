package ThirtyDaysOfCode;

import java.util.Scanner;

public class DayOne {

    public String getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your input text");
        String inputString = input.nextLine();
        return inputString;
    }

    public void printOutput(String printThis) {
        System.out.println("Hello World" + "\n" + printThis);
    }
}
