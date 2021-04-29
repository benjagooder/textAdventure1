package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        menu();
    }

    public static void menu() throws InterruptedException {
        System.out.println("Choose your vendor");
        System.out.println("\n\t1 - Spencer");
        System.out.println("\t2 - Matt");
        System.out.println("\t3 - Kodak employee");
        int flag = Helpers.getNumber();

        if (flag == 1) {
            Spencer.run();
        } else if (flag == 2) {
            Matt.run();
        } else if (flag == 3) {
            Benja.run();
        }
    }
}
