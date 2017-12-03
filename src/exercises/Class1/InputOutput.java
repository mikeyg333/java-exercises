package exercises.Class1;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        String user;

        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        user = in.next();

        System.out.println("Hello " + user + "!");
    }
}
