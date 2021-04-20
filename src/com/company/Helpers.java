package com.company;

import java.util.Scanner;

public class Helpers {

    public static void pressEnterToContinue() {
        try{System.in.read();}
                catch(Exception e){}
    }

    public static void cleanTransition() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Helpers.pressEnterToContinue();
    }

    public static int getNumber(){
        Scanner input = new Scanner(System.in);
        int flag = input.nextInt();
        return flag;
    }

    public static String getString(){
        Scanner input = new Scanner(System.in);
        String flag = input.nextLine();
        return flag;
    }

}
