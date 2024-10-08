package Util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {

    public static int chooseOption(String message, String errorMessage, Integer minvalue, Integer maxValue) {
        System.out.print(message);
        int choice = -1;
        while (true) {
            try {
                choice = new Scanner(System.in).nextInt();
                if (
                        (minvalue == null || choice >= minvalue)
                                && (maxValue == null || choice <= maxValue)
                ) {
                    break;
                }
                System.out.print(errorMessage);
            } catch (InputMismatchException e) {
                System.out.print(errorMessage);
            }
        }
        return choice;
    }
}
