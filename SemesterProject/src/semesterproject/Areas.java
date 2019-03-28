// Semester Project
// Take user through a 'choose your own adventure' style story
// Riley Tucker
// 10-20-2018
package semesterproject;


public class Areas extends Action {
    // set events for each area of the map
    static Action mapArea = new Action();
    static Action lastArea = new Action();
    static boolean beenToZero;
    static boolean beenToTwo;
    static boolean beenToThree;
    static boolean beenToSix;
    static boolean beenToSeven;
    static boolean beenToEight;
    static boolean beenToNine;
    static boolean beenToTen;
    
    //enemies
    static Orc orc1 = new Orc();
    static Orc orc2 = new Orc();
    static Orc orc3 = new Orc();
    static Goblin goblin1 = new Goblin();
    
    // Determine if the player has been to the area before. 
    // If not, display the first-time visit message.
    public static void activateArea() {
        if (Action.getPlayerDead() == false) {
            switch (mapArea.getArea()) {
                case 0:
                    //SemesterProject.storyOutputTF.appendText("\nArea 0\n"); 
                    if (beenToZero == false) {
                        //first time message
                        SemesterProject.storyOutputTF.appendText("\n\nYou wake up in a dark, damp cell. \n"
                                + "Your head throbs in pain. \n"
                                + "You have been taken prisoner by a band of nasty orcs and goblins. \n"
                                + "It appears that their lack of intelligence is on your side, "
                                + "they've left the cell unlocked! You must Escape! \n"
                                + "Opening the cell door, you see three corridors. \n"
                                + "One leading left, one straight, and one the right. \n"
                                + "Down the right hall you can hear several gravely voices shouting... \n"
                                + "Go left, straight, right, or back using the buttons.\n\n");
                        beenToZero = true;
                    }
                    break;
                case 1:
                    //SemesterProject.storyOutputTF.appendText("\nArea 1\n");
                    break;
                case 2:
                    //SemesterProject.storyOutputTF.appendText("\nArea 2\n");                
                    if (beenToTwo == false) {
                        //first time message
                        SemesterProject.storyOutputTF.appendText("There is a set of clothes draped "
                                + "over a chair that looks to be about your size. \n"
                                + "Trading your ratty prisoner’s rags for the outfit, "
                                + "you feel more equipped to face the challenges ahead. Speed increased: +1 \n"
                                + "There is a door to the left and to the right.\n\n");
                        Action.changeCharacterSpeed(1);
                        beenToTwo = true;
                    }
                    break;
                case 3:
                    //SemesterProject.storyOutputTF.appendText("\nArea 3\n");                
                    if (beenToThree == false) {
                        //first time message
                        SemesterProject.storyOutputTF.appendText("You grab a weapon from the rack "
                                + "to better equip yourself once again. Attack Power increased: +1\n\n");
                        Action.changeCharacterAttack(1);
                        beenToThree = true;
                    }
                    break;
                case 4:
                    //SemesterProject.storyOutputTF.appendText("\nArea 4\n");
                    break;
                case 5:
                    //SemesterProject.storyOutputTF.appendText("\nArea 5\n");
                    break;
                case 6:
                    //SemesterProject.storyOutputTF.appendText("\nArea 6\n");                
                    if (beenToSix == false) {
                        //first time message
                        SemesterProject.storyOutputTF.appendText("There is an orc sitting at the"
                                + " table chewing on the last scraps of meat it managed to cook. \n"
                                + "It notices you walk in and quickly stands up. \n"
                                + "The orc snarls, “How you get out?” as he starts to approach you.\n\n");
                        orc1.setOrcStats();
                        beenToSix = true;
                    }
                    break;
                case 7:
                    //SemesterProject.storyOutputTF.appendText("\nArea 7\n");                
                    if (beenToSeven == false) {
                        //first time message
                        SemesterProject.storyOutputTF.appendText("There is an orc counting gold coins. \n"
                                + "The orc sees you enter and shouts as it stands to its feet.\n\n");
                        orc2.setOrcStats();
                        beenToSeven = true;
                    }
                    break;
                case 8:
                    //SemesterProject.storyOutputTF.appendText("\nArea 8\n");                
                    if (beenToEight == false) {
                        //first time message
                        SemesterProject.storyOutputTF.appendText("A single goblin is digging through "
                                + "a crate when he sees you coming through the door. \n"
                                + "He jumps over the crate and heads toward you.\n\n");
                        goblin1.setGoblinStats();
                        beenToEight = true;
                    }
                    break;
                case 9:
                    //SemesterProject.storyOutputTF.appendText("\nArea 9\n");                
                    if (beenToNine == false) {
                        //first time message
                        SemesterProject.storyOutputTF.appendText("A glimmer in the corner catches your eye. \n"
                                + "A small vial containing a rather reflective red liquid is placed in an empty mug. \n"
                                + "You take what you’re sure is a health potion. You gain 10 health.\n\n");
                        beenToNine = true;
                        Action.changeCharacterHealth(10);
                    }
                    break;
                case 10:
                    //SemesterProject.storyOutputTF.appendText("\nArea 10\n");                
                    if (beenToTen == false) {
                        //first time message
                        SemesterProject.storyOutputTF.appendText("When you enter, you see an orc taking"
                                + " its coat off and kicking the remanence of mud from its boots. \n"
                                + "It sees you, draws its blade, and barks, “Get back in your cell!”\n\n");
                        orc3.setOrcStats();
                        beenToTen = true;
                    }
                    break;
                case 11:
                    //SemesterProject.storyOutputTF.appendText("\nArea 11\n");
                    break;
                case 12:
                    //SemesterProject.storyOutputTF.appendText("\nArea 12\n");
                    SemesterProject.storyOutputTF.appendText("You snatch a coat "
                            + "that is hung up next to the door as you run out. "
                            + "You have escaped from the bandit’s dungeon. "
                            + "Now you just have to figure out where you are, and how to get home.\n\n");
                    break;
            }
        }
    }
}