/*
PROMPT
Make a "Choose Your Own Adventure" game. It should feature at least 5  options after the first level prompts, at least
two options for each of the second-level prompts, at least two options for each of the third-level prompts, and add at
least two options for two of the fourth-level prompts for a total of a minimum of twenty two possible destinations.
If you finish please add more options to the first level and follow the same structure.

Once they reach the end of the decision tree, tell the user whether they survived or not. For example, in the first
sample output below,

You die of starvation... eventually
statement informs the user that they did not survive the game.
 */

import java.util.Scanner;

public class AdventureTime {


    public static void runGame(Scanner sc) {
        String input = "";

        System.out.println("Welcome to \"How to fight a zombie!\" ");
        System.out.println("OMG! A Zombie is coming!");
        System.out.println("Quick! choose a weapon: (baseball bat (b), pistol (p), knife(k), hands(h), frying pan(f))");
        System.out.print("Please input based character. ");
        input = sc.next();

        System.out.println();

        switch (input) {
            case "b":
                System.out.println("Nice! You chose the Baseball bat! " +
                        "How do will you swing it? horizontal(h) or vertical(v)");
                input = sc.next();
                if (input.equals("h")) {
                    System.out.println("You swung the bat in a horizontal motion knocking out the zombies legs!");
                    System.out.println("The Zombie is now crawling towards you trying to bite you! " +
                            "Your bat is still usable...");
                    System.out.println("Will you bash it's head in (b) or run (r)?");
                    input = sc.next();
                    if (input.equals("b")) {
                        System.out.println("You muster up all your strength to bash the zombies brains in");
                        System.out.println("You become exhausted after 5 minutes of bashing...");
                        System.out.println("You grow hungry. Will you eat the remains (y/n)?");
                        input = sc.next();
                        if (input.equals("y")) {
                            System.out.println("Wow... you really ate it. Congrats on becoming part of the horde. " +
                                    "I guess");
                            break;
                        } else if (input.equals("n")) {
                            System.out.println("Trick Question Bro. You passed. You die of starvation.");
                            break;
                        }
                    } else if (input.equals("r")) {
                        System.out.println("Nice you ran. Good job on leaving your family. " +
                                "I'm sure they appreciated it");
                        break;
                    }
                } else if (input.equals("v")) {
                    System.out.println("You swung the bat vertically! Right on that stupid zombies head! 10 points");
                    System.out.println("As you celebrated the victory, you see more coming your way...");
                    System.out.println("What do you do? Man up and score more points?(m) or " +
                            "smear the blood of your enemies all over yourself? (s)");
                    input = sc.next();
                    if (input.equals("m")) {
                        System.out.println("NICE! You decided to grow some balls and fight.");
                        System.out.println("You run and yell at the top of your lungs! " +
                                "\"I'M GOING FOR THE TOP SCORE!!!\" ...");
                        System.out.println("As you approach a few feet away from them. " +
                                "You trip on your untied shoelace. And they eat you. Slowly and Painfully");
                        System.out.println("Remember folks: to check your shoes before you fight a zombie horde. :)");
                        break;
                    } else if (input.equals("s")) {
                        System.out.println("Ohhhhh. Someone watches \"The Walking Dead\" Look at you, using TV as " +
                                "a reference.");
                        System.out.println("You decided to use your zombie stained body to blend with the horde...");
                        System.out.println("It didn't work. These zombies from World War Z. Too bad.");
                        break;
                    }
                }
                break;
            case "p":
                System.out.println("Nice! you chose the pistol. Do you have bullets(y/n)?");
                input = sc.next();
                if (input.equals("y")) {
                    System.out.println("Nice! Are you going to shoot yourself (y) are try to survive(s)?");
                    input = sc.next();
                    if (input.equals("y")) {
                        System.out.println("Zombies are cray cray right? I feel you. Peace bro.");
                        break;
                    } else if (input.equals("s")) {
                        System.out.println("Alright :(. You have six bullets and you remember that you don't know " +
                                "how to gun.");
                        System.out.println("You miss. Obviously. Should've shot yourself. Can't miss point blank. " +
                                "Good bye.");
                        break;
                    }
                } else if (input.equals("n")) {
                    System.out.println("Aww. that sucks. Will you throw it away and look for another (t) or use" +
                            " it as a blunt weapon? (b)");
                    input = sc.next();
                    if (input.equals("t")) {
                        System.out.println("You decided to throw away your only defense.");
                        System.out.println("You scavenge for like 5 minutes and you accidentally cut yourself." +
                                "\nYou contract Ebola.");
                        break;
                    } else if (input.equals("b")) {
                        System.out.println("Your so resourceful! Be Proud. Your SMART!");
                        System.out.println("...");
                        System.out.println("Your throw it away anyway because you don't do compliments. " +
                                "NICE TRY!");
                    }

                }
                break;
            case "k":
                System.out.println("Nice! You chose the Kah-niff! What's the enchantment level on it?(1/5)");
                input = sc.next();
                if (input.equals("1")) {
                    System.out.println("1?!?! That's not even enough to slit a helpless child throat.");
                    System.out.println("Want to try enchanting for the first time? (y/n)");
                    input = sc.next();
                    if (input.equals("y")) {
                        System.out.println("Abra Kadabra! My K-nife will go Cha-Cha-Cha! ...");
                        System.out.println("It fails miserably and the Kah-niff gets lodged in your knee. " +
                                "And that kids is how you stop being an adventurer.");
                        break;
                    } else if (input.equals("n")) {
                        System.out.println("A Man... or Woman of true intellect! ... A Zombie bites your face off," +
                                " as you try to defend yourself with a dull Kife");
                        break;
                    }
                } else if (input.equals("5")) {
                    System.out.println("ZOMG! LMAO! Time to PWN sum nubs. " +
                            "Killing Rampage or Peaceful Slaughter? (k/p)");
                    input = sc.next();
                    if (input.equals("k")) {
                        System.out.println("You take out a small plastic baggie filled with "
                                + "mysterious white powder from your pocket and place a small dab on the K-nife. ");
                        System.out.println("You feel a great surge of power rising from your inner loins as" +
                                " you plunge the blade into the zombies heart.");
                        System.out.println("........");
                        System.out.println("The zombie shakes his head in disapproval as it lodges it's mouth " +
                                "right unto your neck.");
                        System.out.println("Don't do drugs kids. It'll make you forget that zombies can't die " +
                                "from heart attacks.");
                        break;
                    } else if (input.equals("p")) {
                        System.out.println("Peaceful Slaughter? That's a oxymoron... You kill 5 zombies" +
                                " dressed as Ghandi?");
                        System.out.println("Grats. You win.... no... actually.... OK. Fine.");
                        break;
                    }
                }
                break;
            case "h":
                System.out.println("Nice! You are going bare-handed! How much fighting experience do you have?" +
                        " A lot or none? (a/0)");
                input = sc.next();
                if (input.equals("a")) {
                    System.out.println("Cool. Cool. The zombie your fighting looks a lot like....");
                    System.out.println("Mike Tyson or a small child (m/c)");
                    input = sc.next();
                    if (input.equals("m")) {
                        System.out.println("Well. Atleast this is just a zombie version of Mike Tys.....");
                        System.out.println("T.K.O! Tyson Kills Obviously");
                        break;
                    } else if (input.equals("c")) {
                        System.out.println("You approach the tiny figure and you give it your best 1-2.");
                        System.out.println("It lays on the ground motionless. Other zombies just shake their " +
                                "head disapprovingly");
                        System.out.println("You die of Shame.");
                        break;
                    }
                } else if (input.equals("0")) {
                    System.out.println("Just gonna wing it I see... I respect that. Good luck.");
                    System.out.println("In fact, I'm going to give you an item free of charge.");
                    System.out.println("What would you like? Liquid Courage or brass knuckles (l/b)");
                    input = sc.next();
                    if (input.equals("l")) {
                        System.out.println("Wow. Can you be anymore awesome. 0 experience and your going to" +
                                " fight drunk.");
                        System.out.println("I'm going to put some shades on your corpse and a sign that says:");
                        System.out.println("Here lies someone who was just... too cool be amongst the living.");
                        break;
                    } else if (input.equals("b")) {
                        System.out.println("When you strap on the knuckles for the first time...");
                        System.out.println("A inner fire you never knew you had, erupts onto the surface");
                        System.out.println("Blessing you with overflowing confidence and a unbreakable resolve.");
                        System.out.println("This is when you knew, that this everfleeting moment is whats been " +
                                "missing in your life.");
                        System.out.println("With all the emotions of finding your one true purpose in life, you " +
                                "let out a roar that shook the Earth " +
                                "beneath your feet");
                        System.out.println("...");
                        System.out.println("You have died of a Heart Attack.");
                        break;
                    }
                }
                break;
            case "f":
                System.out.println("Nice! You chose a frying pan? Cast Iron or Stainless Steel? (c/s)");
                input = sc.next();
                if (input.equals("c")) {
                    System.out.println("Nice. Its highly durable, hold all kinds of heat, and can last a " +
                            "lifetime if taken care properly.");
                    System.out.println("Keep talking about cast iron? (y/n)");
                    input = sc.next();
                    if (input.equals("y")) {
                        System.out.println("It cooks steaks beautifully and its non-stick!?!");
                        System.out.println("Plus you don't need soap to clean it else it will erode the seasoning.");
                        System.out.println("It's also relatively inexpansive compared to other pans and it can " +
                                "boost your iron intake.");
                        System.out.println("...Zombies bites your throat so you stop talking about cast iron pans.");
                        break;
                    } else if (input.equals("n")) {
                        System.out.println("Back to the matter at hand. You swing the pan around like a wild man.");
                        System.out.println("You killed several zombies and found that cast iron pans are also " +
                                "great at delivering blunt trauma");
                        System.out.println("But you also ruined the pan forever as now the cast iron" +
                                " has zombie seasoning");
                        System.out.println("This mistake has led to another crucial decision you must make...");
                        System.out.println("How do you clean the pan? Soap or Water (s/w)");
                        input = sc.next();
                        if (input.equals("s")) {
                            System.out.println("You heathen. You don't disrespect cast irons like that. >:( ");
                            System.out.println("You trip and fell... and choked on soap");
                            break;
                        } else if (input.equals("w")) {
                            System.out.println("Well... its not the best solution but hey. Zombie seasoning" +
                                    " might be good.");
                            System.out.println("In fact, since its on a cast iron you might not die.");
                            System.out.println("...");
                            System.out.println("Eating from the cast iron with zombie seasoning has given " +
                                    "you everlasting life.");
                            break;
                        }
                    }
                } else if (input.equals("s")) {
                    System.out.println("Stainless steel. I see you are a person who likes shiny things");
                    System.out.println("Okay, Do you throw it away and look for a cast iron or use it? (t/u)");
                    input = sc.next();
                    if (input.equals("t")) {
                        System.out.println("You throw it. It lands on a random landmine.");
                        System.out.println("You die. the zombies die. whatever >_> ");
                        break;
                    } else if (input.equals("u")) {
                        System.out.println("You try smacking it on a zombie.");
                        System.out.println("It's not very effective...");
                        System.out.println("Zombie used Bite!");
                        System.out.println("It's super effective!");
                        System.out.println("You Die.");
                        break;
                    }
                }
                break;
        }
        System.out.println("Thanks for playing!");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AdventureTime game = new AdventureTime();
        game.runGame(sc);
        sc.close();
    }
}
