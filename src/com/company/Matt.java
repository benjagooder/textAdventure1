package com.company;

public class Matt {
    public static void run() {

// all the code I create goes here for now
        System.out.println("What's your name, friend?");
        String playerName = Helpers.getString();

        System.out.println("Welcome to Farty's Fantastic Facos, " + playerName + ".");
        System.out.println("What can I rassle up for ya?");
        System.out.println("\n\t1 - Doogie Hoogie, MD");
        System.out.println("\t2 - Blinded by the Bite");
        System.out.println("\t3 - Bertha");
        System.out.println("\t4 - Captain Nemo's Salty Surprise");
        int order = Helpers.getNumber();

//user places their order
        if (order == 1) {
            System.out.println("Ah, a classic choice.");
            String facosOrder = "Doogie Hoogie MD";
            Payment();
        } else if (order == 2) {
            System.out.println("You like some spice, eh, " + playerName + ".");
            String facosOrder = "Blinded by the Bite";
            Payment();
        } else if (order == 3) {
            System.out.println("A true adventurer, I see.");
            String facosOrder = "Bertha";
            Payment();
        } else if (order == 4) {
            System.out.println("Didn't peg you for, well, a pegger. Why don't you head on over to [Spencer's brothel].");
        } // how do we make it repeat the question if the user types something besides 1-4?

//user decides if they want sauce
        System.out.println("You want any sauce on this faco?");
        System.out.println("\t1 - Dat Nu-Nu");
        System.out.println("\t2 - Blue Shine");
        System.out.println("\t3 - Bertha");
        System.out.println("\t4 - I'm good, thanks!");
        int saucyBoi = Helpers.getNumber();
        if (saucyBoi == 1) {
            System.out.println("All right, so that'll be " + order + " with Dat Nu-Nu.");
        } else if (saucyBoi == 2) {
            System.out.println("I'm blue, if I was green I would die... One " + order + " Blue Shine on top.");
        } else if (saucyBoi == 3) {
            System.out.println("Bertha all up in " + order + ". I love it.");
        } else if (saucyBoi == 4) {
            System.out.println("Just the " + order + " then.");     // how do I make it so facosOrder works with these lines?
        }
        System.out.println("\nEnjoy your meal, and come back soon!");
        System.out.println("The end, for now...");
    }
    //payment method, which is referenced above
    public static void Payment() {
        System.out.println("And how are you planning to pay for your facos?");
        System.out.println("\n\t1 - I have some Conglomerate Chydris. You take that?");
        System.out.println("\t2 - Ummmm...");
        System.out.println("\t3 - Yeah, I don't have any money on me.");
        int paymentMethod = Helpers.getNumber();

        if (paymentMethod == 1) {
            System.out.println("That'll work!");
        } else if (paymentMethod == 2) {
            System.out.println("'Ummm...' what?");
            System.out.println("\n\t1 - .....");
            System.out.println("\t2 - Need someone to do the dishes?");
            int paymentMethod2 = Helpers.getNumber();
            if (paymentMethod2 == 1) {
                System.out.println(".....");
                System.out.println("\n\t1 - .....");
                System.out.println("\t2 - I think I will just head out.");
                int paymentMethod3 = Helpers.getNumber();
                if (paymentMethod3 == 1) {
                    System.out.println("Fine. This one is on the house.");
                } else if (paymentMethod3 == 2) {
                    System.out.println("I think that is a good idea.");
                }
            } else if (paymentMethod2 == 2) {
                System.out.println("Come on back.");
                dishesMiniGame();
            }
        } else if (paymentMethod == 3) {
            System.out.println("Then I don't think you're getting any facos today, friend.");
        }
    }

    //dishes miniGame method, which is referenced above
    public static void dishesMiniGame() {
        System.out.println("So you gotta dunk 'em if they're dirty and dry 'em if they're wet. Got it?");
        System.out.println("If a dirty dish (odd number) pops up, dunk it. If a wet dish (even number) pops up, dry it.");
        System.out.println("\n\t1 - dunk it");
        System.out.println("\t2 - dry it"); //So the code below gives a random number and checks if the user enters odd or even, but I want it to compare the random number (odd/even) against the user input
        for (int i = 0; i < 6; i++) {
            randomNumber1to25();
            int dishDoingFiend = Helpers.getNumber();
                if (dishDoingFiend % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
        System.out.println("Not too bad; not too bad."); // how can I get the user's name here (playerName)
        System.out.println("Here is the promised faco. Enjoy it.");
        }
    }

    public static void randomNumber1to25() {
        int min = 1;
        int max = 25;
        int randomNum = (int)(Math.random()*(max-min+1)+min);
        // return randomNum; // I can print it out, but not return it
        System.out.println(randomNum);
    }
}