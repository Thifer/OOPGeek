package Lesson6.srp2;

import java.util.Scanner;

public class WorkWithConsole {
    private static final Scanner scanner = new Scanner(System.in);
    public static String inputFromConsole(String output){
        return prompt(output);
    }

    private static String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
