package com.company;

public class Benja {

    public static void run() {
        System.out.println("Benja's portion");

        intro();
        middle();
        anotherMiddleBecauseFuckYou();
        last();
    }

    public static void intro() {
        System.out.println("Please name your ship");
        String shipTitle = Helpers.getString();

        System.out.println("\n\t--------------------------------- CHAPTER 4: Raising Flags ----------------------------------------");

        System.out.println("\nAdmiral Robotson sings gaily in the background as he steadies the " + shipTitle + " over the world below.");
        System.out.println("\n\t\"Do not be fooled, there is never just one");
        System.out.println("\tThese damn waves are temp'ry, no fear need we shun");
        System.out.println("\tWhat course ought we set?  What flag do we run?\"");

        // Choose thine own flag, Captain
        System.out.println("\nObserving the foggy, alien landscape below, " + "<heroTitle>" + " absent-mindedly finishes the verse... ");
        System.out.println("\n\t1 - \"Love all.  Trust few.  Do wrong to none.\"");
        System.out.println("\t2 - \"Me and mine own.  I need no redemption\"");
        int userNumber = Helpers.getNumber();

        if (userNumber == 1) {
            System.out.println("\nYou swell with a rich appreciation for life ---> Pluck increases");
            System.out.println("                                            ---> Focus decreases");
        } else if (userNumber == 2) {
            System.out.println("\nYou surge with ambition for the hunt ---> Focus increases");
            System.out.println("                                     ---> Pluck decreases");
        }

        System.out.println("\nYou give yourself to the planet's heavy pull");
    }

    public static void middle() {
        System.out.println("middle");
    }

    public static void anotherMiddleBecauseFuckYou() {
        System.out.println("angry middle");
    }

    public static void last() {
        System.out.println("last");

    }
}
