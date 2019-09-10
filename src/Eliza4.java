/*
Now that your personal digital therapist, Eliza, is up and running, it's time to step it up with some Easter Eggs.

If you type "pig" Eliza should begin speaking in pig latin (Source: https://en.wikipedia.org/wiki/Pig_Latin

Pig Latin Rules:

If the first letter is a consonant, add "ay" to the end
If the first letter is a vowel, add "way" or "tay" to the end
Don't worry about the "multiple-letters-that-sounds-like one" rule (ex. str-, ch-, th-, etc.)
Additional Features:

If you type "caps" Eliza should begin speaking in all caps.

If you type "play game" Eliza should allow you to play a game, such as your choose your own adventure game.

If you type in "red" Eliza 's text should be displayed in red.

At the end of the chat, print out the chat history.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Eliza4{
    public static Random rnd = new Random();

    Eliza4(){ System.out.println("Good day. What is your problem?"); }

    private boolean check(String userInput){
        if(userInput.equalsIgnoreCase("I am feeling great") ||
                userInput.equalsIgnoreCase("Q"))
            return true;
        else
            return false;
    }

    private ArrayList<String> splitString(String userInput){
        ArrayList<String> brokenString = new ArrayList<>();
        for(String s : userInput.split(" "))
            brokenString.add(s);
        return brokenString;
    }

    private String ElizaOutput(ArrayList<String> brokenString){
        String elizaOut = "";
        for(String s : brokenString) {
            if(s.equalsIgnoreCase("i") || s.equalsIgnoreCase("me"))
                s = "you";
            else if(s.equalsIgnoreCase("my"))
                s = "your";
            else if(s.equalsIgnoreCase("am"))
                s = "are";

            elizaOut += s + " ";
        }
        return elizaOut;
    }

    private String addHedgeOrQualifier(int choice, String userInput){
        String str = new String();
        int choice2 = rnd.nextInt(3);
        if(choice == 0){
            switch (choice2) {
                case 0:
                    str = "Please tell me more";
                    break;
                case 1:
                    str = "Many of my patients tell me the same thing";
                    break;
                case 2:
                    str = "It is getting late, maybe we had better quit";
                    break;
            }
        } else if(choice == 1){
            switch (choice2) {
                case 0:
                    str = "Why do you say that \"" + userInput + "\"";
                    break;
                case 1:
                    str = "You seem to think that \"" + userInput + "\"";
                    break;
                case 2:
                    str = "So, you are concerned that \"" + userInput + "\"";
                    break;
            }
        }
        return str;
    }

    private String secretWordMod(String secretWord, String toModify) {
        String modified = "";

        switch (secretWord){
            case "pig":
                if(toModify.toLowerCase().startsWith("a") || toModify.toLowerCase().startsWith("e")
                        || toModify.toLowerCase().startsWith("i") || toModify.toLowerCase().startsWith("o")
                        || toModify.toLowerCase().startsWith("u")  || toModify.toLowerCase().startsWith("y"))
                    if(rnd.nextInt(2) == 0)
                        modified = toModify + "way";
                    else
                        modified = toModify + "tay";

                else
                    modified = toModify + "ay";
                break;
            case "caps":
                modified = toModify.toUpperCase();
                break;
            case "red":
                modified = "\033[0;31m" + toModify;
                break;
        }
        return modified;
    }

    public static void main(String[] args) {
        Eliza4 e = new Eliza4();
        Scanner sc = new Scanner(System.in);
        String userInput, elizaOutput, secretWord ="";
        ArrayList<String> brokenString;
        AdventureTime game;

        while(true) {
            System.out.print("Enter your response here or Q to quit: ");
            userInput = sc.nextLine();

            if (e.check(userInput))
                break;
                //SecretWords
            else if(userInput.equalsIgnoreCase("pig")){
                secretWord = "pig";
                continue;
            } else if(userInput.equalsIgnoreCase("caps")) {
                secretWord = "caps";
                continue;
            } else if(userInput.equalsIgnoreCase("red")) {
                secretWord = "red";
                continue;
            } else if(userInput.equalsIgnoreCase("play game")) {
                game = new AdventureTime();
                game.main(null);
                sc.nextLine();
                continue;
            }

            //Split String , replace words, and store into ArrayList
            brokenString = e.splitString(userInput);

            //Add Hedge or qualifier
            elizaOutput = e.ElizaOutput(brokenString);
            elizaOutput = e.addHedgeOrQualifier(rnd.nextInt(2), elizaOutput.trim());

            if(secretWord.isEmpty())
                System.out.println(elizaOutput);
            else //Secret Word modified statements
                System.out.println(e.secretWordMod(secretWord,elizaOutput));
        }
        sc.close();
    }
}