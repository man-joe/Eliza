/*
You will be creating an interactive chat-bot type program. Eliza is a therapist program that interacts with the user.
Your program will need to evaluate what the user asks and turn the user's input into a question that sounds like the
therapist really cares.

Sample hedges:
Please tell me more
Many of my patients tell me the same thing
It is getting late, maybe we had better quit

Sample qualifiers:
Why do you say that
You seem to think that
So, you are concerned that
Replacements:

replace i with you
replace me with you
replace my with your
replace am with are


When the user enters a statement the program responds in one of two ways:

1. With a randomly chosen hedge, such as "Please tell me more"

2. By changing some keywords  in the user's input string an appending this string to a randomly chosen qualifier.
To get a random item from an array, select a random number for one of the array index values and use the value at that
index for your qualifier.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Eliza3{
    public static Random rnd = new Random();

    Eliza3(){ System.out.println("Good day. What is your problem?"); }

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

    public static void main(String[] args) {
        Eliza3 e = new Eliza3();
        Scanner sc = new Scanner(System.in);
        String userInput, elizaOutput;
        ArrayList<String> brokenString;

        while(true) {
            System.out.print("Enter your response here or Q to quit: ");
            userInput = sc.nextLine();

            if (e.check(userInput)) {
                break;
            }

            //Split String , replace words, and store into ArrayList
            brokenString = e.splitString(userInput);

            //Add Hedge or qualifier
            elizaOutput = e.ElizaOutput(brokenString);
            elizaOutput = e.addHedgeOrQualifier(rnd.nextInt(2), elizaOutput);

            System.out.println(elizaOutput);
        }
    }
}