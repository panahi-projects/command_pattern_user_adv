package org.command_pattern_user_adv;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter the number of commands:");
        int commandsNum = inputReader.nextInt();

        System.out.println(commandsNum);
    }
}