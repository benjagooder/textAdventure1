package com.company;

public class Benja {

    private static String heroName;
    private static String head_1;
    private static String head_2;
    private static String head_3;
    private static String head_4;
    private static String head_5;
    private static String head_6;
    private static String eyes;
    private static String lips;
    private static String currentBeautyScore;
    private static String beautyScoreTitle;

    private static String eyesRegular = "    o    o   ";
    private static String eyes_withGlasses = "   '0----0'''";
    private static String antiWig_1 = "      ______      ";
    private static String antiWig_2 = "    /        \\    ";
    private static String antiWig_3 = " |   ";
    private static String antiWig_4 = " /    ";
    private static String antiWig_5 = " /      ";
    private static String antiWig_6 = "        ";

    private static String hair_1 = "     #######      ";
    private static String hair_2 = "   ## #### ###    ";
    private static String hair_3 = "###  ";
    private static String hair_4 = " ###  ";
    private static String hair_5 = "   ###  ";
    private static String hair_6 = "``````  ";

    private static String lips_regular = "   =======";
    private static String lips_duckFace = "   =      ";

    public static void run() throws InterruptedException {
        intro();
        pictureQuestion();
        wigQuestion();
        glassesQuestion();
        lipsQuestion();
    }

    public static void intro() throws InterruptedException {
        System.out.println("\n\t--------------------------------- Kodak Photography: We're the big picture \"people\" ----------------------------------------\n");

        // Character Defaults
        makeHeroFaceNormal();
    }

    // Questions
    public static void pictureQuestion() throws InterruptedException {
        System.out.println("Yer gonna need some identification, mister... er.. whaddathey call ye?");
        Thread.sleep(1000);
        heroName = Helpers.getString();
        Thread.sleep(2000);
        System.out.println();
        System.out.println("huh... Well, as I was sayin', yer gonna need some identification... Hows about I take yer picture?");
        System.out.println("\n\t1 - \"Please do...\"");
        System.out.println("\t2 - \"I refuse. And you are a scoundrel.\"");
        int userNumber = Helpers.getNumber();

        if (userNumber == 1) {
            System.out.println("\n\"Well, well\"");
            System.out.println("*snap* *snap* *snap* *snap*");

        } else if (userNumber == 2) {
            System.out.println("*snap*");
            Thread.sleep(500);
            System.out.println("Haha, oops too slow, huh? haha...");
        }

        Thread.sleep(5000);

        showIdentificationCard();
        gradeBeauty();
    }
    public static void wigQuestion() {
        System.out.println("Alright, " + heroName + " and I'm only telling you this because I like you, but you should use some of these props.");
        System.out.println("\"Want to try on this wig?\"");
        System.out.println("\n\t1 - Yes");
        System.out.println("\t2 - No");
        int wigChoice = Helpers.getNumber();

        if (wigChoice == 1) {
            makeHeroHairy();
            increaseBeautyScore();
        } else if (wigChoice == 2) {
            makeHeroBald();
        }

        System.out.println("*snap*");
        showIdentificationCard();
        gradeBeauty();
    }
    public static void glassesQuestion() {
        System.out.println("\"Want these glasses?\"");
        System.out.println("\n\t1 - Yes");
        System.out.println("\t2 - No");
        int glasses = Helpers.getNumber();

        if (glasses == 1) {
            eyes = eyes_withGlasses;
            increaseBeautyScore();
        } else if (glasses == 2) {
            eyes = eyesRegular;
        }

        System.out.println("*snap*");
        showIdentificationCard();
        gradeBeauty();
    }
    public static void lipsQuestion() {
        System.out.println("\"Hows 'bout you make your lips as if they were a duck's bill?\"");
        System.out.println("\n\t1 - Lustfully \"Quack\" at the Kodak employee while pursing your lips");
        System.out.println("\t2 - No");
        int lipsChoice = Helpers.getNumber();

        if (lipsChoice == 1) {
            lips = lips_duckFace;
            // if user chooses this and all others, then their currentBeautyScore should be maxed out at "S"
            increaseBeautyScore();
        } else if (lipsChoice == 2) {
            lips = lips_regular;
        }

        System.out.println("*snap*");
        showIdentificationCard();
        gradeBeauty();
    }

    // Beauty Score
    public static void increaseBeautyScore() {
        if (currentBeautyScore == "F") {
            currentBeautyScore = "C";
            beautyScoreTitle = "Common Goose";
        } else if (currentBeautyScore == "C") {
            currentBeautyScore = "B";
            beautyScoreTitle = "Banged Swan";
        } else if (currentBeautyScore == "B") {
            currentBeautyScore = "A";
            beautyScoreTitle = "Avian Model";
        } else if (currentBeautyScore == "A") {
            currentBeautyScore = "S";
            beautyScoreTitle = "Supreme";
        }
    }
    public static void gradeBeauty() {
        if (currentBeautyScore == "F") {
            System.out.println("You look F-O-U-L! I'm kind of into birds.. Wanted ta' make the distinction between you and any of them clear...");
        }

        if (currentBeautyScore == "C") {
            System.out.println("Straight average. Probably like only one 'a them common gooses\" The Kodak employee spits off to the side.");
        }

        if (currentBeautyScore == "B") {
            System.out.println("The Kodak employee's throat goes dry and he sputters a surprised cough");
            System.out.println("\"Well now.. heh.. Your gonna hafta excuse my dribblings, heh. You're remindin' me 'a the first swan I ever laid with. heh, heh.\"");
        }

        if (currentBeautyScore == "A") {
            System.out.println("Sweet m-, m-, m-, mercy...\" Tears well in the man's sun-laden eyes");
            System.out.println("The Kodak employee makes whispered squawks in a mounting frenzy...");
        }

        if(currentBeautyScore == "S") {
            System.out.println("\"UGHGughsdughunnnnnnnnngggggghhh\"");
            System.out.println("The Kodak employee falls faint as a mixture of his different bodily fluids pool around him");
            System.out.println("All pleasures of the bazaar are now open to you");
        }
    }

    // Appearance Changes
    public static void makeHeroFaceNormal() {
        makeHeroBald();
        eyes = eyesRegular;
        lips = lips_regular;
        currentBeautyScore = "F";
        beautyScoreTitle = "Foul nonfowl";
    }
    public static void makeHeroBald() {
        head_1 = antiWig_1;
        head_2 = antiWig_2;
        head_3 = antiWig_3;
        head_4 = antiWig_4;
        head_5 = antiWig_5;
        head_6 = antiWig_6;
    }
    public static void makeHeroHairy() {
        head_1 = hair_1;
        head_2 = hair_2;
        head_3 = hair_3;
        head_4 = hair_4;
        head_5 = hair_5;
        head_6 = hair_6;
    }
    
    // Identification Card
    public static void showIdentificationCard() {
        System.out.println("_________________________________________________");
        System.out.println("|------------------------------------------------|");
        System.out.println("|---" + head_1 + "---------------------------|");
        System.out.println("|---" + head_2 + "--- BEAUTY RATING:    -----|");
        System.out.println("|---" + eyes + head_3 + "---     " + beautyScoreTitle + "  -----|");
        System.out.println("|---     <      " + head_4 +"---------------------------|");
        System.out.println("|---" + lips + "" + head_5 + "---------------------------|");
        System.out.println("|---     \\   /" + head_6 + "---------------------------|");
        System.out.println("|---      | |         ---------------------------|");
        System.out.println("|------------------------------------------------|");
        System.out.println("|------ " + heroName + " -------------------------------|");
        System.out.println("|------------------------------------------------|");
        System.out.println("--------------------------------------------------");
    }

}
