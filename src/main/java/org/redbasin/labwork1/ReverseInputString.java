package org.redbasin.labwork1;

import java.util.Scanner;

/**
 * Reverse characters in the input String and print it.
 *
 * 1. Type this program and compile it.
 * 2. Run it and verify the behavior.
 * 3. Modify it so that it will ask "Enter a line: " each time before you type the line
 * 4. Modify it so that if you enter quit or QUIT, it will quit the program instead of reversing quit.
 * 5. Now modify it so that when you have reversed 5 strings it will say bye and exit.
 * 6. Reverse the string a second time to get back the original string and print it.
 *
 * @author mjoshi
 */
public class ReverseInputString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        while (in.hasNextLine()) {
           input = in.nextLine();
           for (int i = input.length()-1; i >= 0; i--) {
               System.out.print(input.charAt(i));
           }
           System.out.println();
        }
    }
}