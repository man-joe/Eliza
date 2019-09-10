/*
You will continue creating an interactive chat-bot type program. Eliza is a therapist program that interacts
with the user. Your program will need to evaluate what the user asks and turn the user's input into a question
that sounds like the therapist really cares.

Use HashMaps or String arrays to loop through user's input and implement the following:

Replacements:

replace i with you
replace me with you
replace my with your
replace am with are
We will continue to build on top of this application throughout the week.

Here's how the replacement works:

The user enters something at the prompt: "my teacher hates me"

The program will loop through that string and replace "my" with "your" and "me" with "you" and then prepend the
qualifier to the replacement string. So, my teacher hates me becomes "Why do you say that your teacher hates you?"
The replacement method returns the same words as the user entered only the replacement words have been swapped.

Spend some time thinking how you would search through a string and replacing specific words. Hint: read about
the split operator.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Eliza2{

    Eliza2(){
        System.out.println("Good day. What is your problem?");
    }

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

    public static void main(String[] args) {
        Eliza2 e = new Eliza2();
        Scanner sc = new Scanner(System.in);
        String userInput;
        ArrayList<String> brokenString;

        while(true) {
            System.out.print("Enter your response here or Q to quit: ");
            userInput = sc.nextLine();
            //Split String and store into ArrayList
            brokenString = e.splitString(userInput);
            System.out.println(e.ElizaOutput(brokenString));
            if (e.check(userInput)) {
                break;
            }
        }
    }
}