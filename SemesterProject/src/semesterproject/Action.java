// Semester Project
// Riley Tucker
// 11-9-18
package semesterproject;



public class Action extends FantasyRace {
    
    // variables
    private static boolean orc1StatsSet;
    private static boolean orc2StatsSet;
    private static boolean orc3StatsSet;    
    private static boolean goblin1StatsSet;
    private static boolean startingMove;
    private static boolean playerDead;
    private static int area;
    private static int lastArea;
    private static int characterHealth = getCharacterHealth();
    private static int characterAttack = getCharacterAttackPower();
    private static int characterSpeed = getCharacterSpeed();
    private static int enemyHealth = getEnemyHealth();
    private static int enemyAttack = getEnemyAttackPower();
    private static int enemySpeed = getEnemySpeed();
    
    
    // getters
    public static int getArea() {
        return area;
    }
    public static int getLastArea() {
        return lastArea;
    }
    public static boolean getPlayerDead() {
        return playerDead;
    }
    
    
    // setters
    public static void setArea(int newArea) {
        area = newArea;
    }
    public static void setLastArea(int newArea) {
        lastArea = newArea;
    }
    public static void changeCharacterHealth(int i) {
        characterHealth = characterHealth + i;
        String newHealthString = Integer.toString(characterHealth);
        SemesterProject.constitutionTF.setText(newHealthString);
    }
    public static void changeCharacterAttack(int i) {
        characterAttack = characterAttack + i;
        String newAttackString = Integer.toString(characterAttack);
        SemesterProject.strengthTF.setText(newAttackString);
    }
    public static void changeCharacterSpeed(int i) {
        characterSpeed = characterSpeed + i;
        String newSpeedString = Integer.toString(characterSpeed);
        SemesterProject.dexterityTF.setText(newSpeedString);
    }
    public static boolean setPlayerDead(boolean d) {
        playerDead = d;
        return playerDead;
    }
    
    // default constructor
    Action() {
        area = getArea();
    }    
    
    
    // methods
    public static void goLeft() {
        if (Action.getPlayerDead() == false) {
            switch (Areas.mapArea.getArea()) {                  
                case 0:
                    // on start set to area 1
                    if (startingMove == false) {
                        if (Areas.lastArea.getLastArea() == 0) {
                            Areas.mapArea.setArea(1);
                            SemesterProject.storyOutputTF.appendText("\nYou enter a room with "
                                    + "more cells lining the left wall. "
                                    + "A few of them are occupied by other bloody and bruised prisoners. "
                                    + "There is no way for you to help them. "
                                    + "There is a doorway to leave the room to the right.\n");
                            Areas.activateArea();
                        }
                        startingMove = true;
                        Areas.lastArea.setLastArea(0);
                    }
                    break;
            case 1:
                // if came from area 2, set to area 0
                if (Areas.lastArea.getLastArea() == 2) {
                    Areas.mapArea.setArea(0);
                    Areas.lastArea.setLastArea(1);
                    SemesterProject.storyOutputTF.appendText("\nThis is the cell room that you woke up in."
                            + " There is a doorway straight ahead and the one you came from.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                }
                break;
            case 2:
                // if came from area 1 set to area 3
                // if came from area 4 set to area 1
                if (Areas.lastArea.getLastArea() == 1) {
                    Areas.mapArea.setArea(3);
                    Areas.lastArea.setLastArea(2);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room with "
                            + "a pile of sacks and barrels in the corner and a disorganized "
                            + "rack of weapons lining the wall. The only way out is back the way you came.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 4) {
                    Areas.mapArea.setArea(1);
                    Areas.lastArea.setLastArea(2);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with more cells lining the left wall. A few of them "
                            + "are occupied by other bloody and bruised prisoners. "
                            + "There is no way for you to help them. "
                            + "There is a doorway to leave the room to the left.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                }
                break;
            case 3:
                // can't
                SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                break;
            case 4:
                // if came from area 2 set to area 8
                // if came from area 8 set to area 5
                if (Areas.lastArea.getLastArea() == 2) {
                    Areas.mapArea.setArea(8);
                    Areas.lastArea.setLastArea(4);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with a couple of barrels and crates scattered about. "
                            + "There are various symbols on them, they are probably "
                            + "the spoils of many carriage ambushes. "
                            + "There is a way out straight ahead and to the right.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 8) {
                    Areas.mapArea.setArea(5);
                    Areas.lastArea.setLastArea(4);
                    SemesterProject.storyOutputTF.appendText("\nA rancid smell fills"
                            + " your nostrils as you enter this room. "
                            + "It appears to be some kind of washroom; although, "
                            + "you aren’t sure if any washing has ever taken place in here. "
                            + "There is a way out of here to the left and to the right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                }
                break;
            case 5:
                // if came from area 4 set to area 10
                // if came from area 6 set to area 4
                if (Areas.lastArea.getLastArea() == 4) {
                    Areas.mapArea.setArea(10);
                    Areas.lastArea.setLastArea(5);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room with "
                            + "several weapons, boxes of food, and some coats lying about. "
                            + "It is slightly cooler in this room than in the rest of this place. "
                            + "There is a way out to the left and to the right.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 6) {
                    Areas.mapArea.setArea(4);
                    Areas.lastArea.setLastArea(5);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a lounging room. "
                            + "There are chairs around a large table with playing cards scattered about."
                            + " There is a doorway out of this room straight ahead and to the right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                }
                break;
            case 6:
                // if enemy is there, have to run() or fight()
                if (Areas.orc1 != null) {
                    SemesterProject.storyOutputTF.appendText("\nThe orc is blocking you. Run or fight!\n");
                } else {
                    // if came from area 0 set to area 5
                    // if came from area 5 set to area 7
                    if (Areas.lastArea.getLastArea() == 0) {
                        Areas.mapArea.setArea(5);
                        Areas.lastArea.setLastArea(6);
                        SemesterProject.storyOutputTF.appendText("\nA rancid smell "
                                + "fills your nostrils as you enter this room. "
                                + "It appears to be some kind of washroom; although, "
                                + "you aren’t sure if any washing has ever taken place in here. "
                                + "There is a way out of here straight ahead and to the left.\n");
                    Areas.activateArea();
                    } else if (Areas.lastArea.getLastArea() == 5) {
                        Areas.mapArea.setArea(7);
                        Areas.lastArea.setLastArea(6);
                        SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                                + "with several cots lining the walls. "
                                + "Like everything else in this place, the beds are dirty and unkept. "
                                + "There is a way out to the left.\n");
                    Areas.activateArea();
                    } else {
                        SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                    }                    
                }
                break;
            case 7:
                // if enemy is there, have to run() or fight()
                if (Areas.orc2 != null) {
                    SemesterProject.storyOutputTF.appendText("\nThe orc is blocking you. Run or fight!\n");
                } else {
                    // if came from area 6 set to area 11
                    if (Areas.lastArea.getLastArea() == 6) {
                        Areas.mapArea.setArea(11);
                        Areas.lastArea.setLastArea(7);
                        SemesterProject.storyOutputTF.appendText("\nThis room is cold. "
                                + "You must be close to the exit now. "
                                + "There is a way out straight ahead and to the left. "
                                + "There are muddy tracks coming from the door straight ahead of you.\n");
                    Areas.activateArea();
                    } else {
                        SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                    }                    
                }
                break;
            case 8:
                // if enemy is there, have to run() or fight()
                if (Areas.goblin1 != null) {
                    SemesterProject.storyOutputTF.appendText("\nThe goblin is blocking you. Run or fight!\n");
                } else {
                    // if came from area 9 set to area 10
                    // if came from area 10 set to area 4
                    if (Areas.lastArea.getLastArea() == 9) {
                        Areas.mapArea.setArea(10);
                        Areas.lastArea.setLastArea(8);
                        SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                                + "with several weapons, boxes of food, and some coats lying about. "
                                + "It is slightly cooler in this room than in the rest of this place."
                                + " There is a way out straight ahead and to the right.\n");
                    Areas.activateArea();
                    } else if (Areas.lastArea.getLastArea() == 10) {
                        Areas.mapArea.setArea(4);
                        Areas.lastArea.setLastArea(8);
                        SemesterProject.storyOutputTF.appendText("\nYou enter a lounging room. "
                                + "There are chairs around a large table with playing cards scattered about."
                                + " There is a doorway out of this room to the left and to the right.\n");
                    Areas.activateArea();
                    } else {
                        SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                    }
                }
                break;
            case 9:
                // can't
                SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                break;
            case 10:       
                // if enemy is there, have to run() or fight()
                if (Areas.orc3 != null) {
                    SemesterProject.storyOutputTF.appendText("\nThe orc is blocking you. Run or fight!\n");
                } else {        
                    // if came from area 5 set to area 8
                    // if came from area 11 set to area 5
                    if (Areas.lastArea.getLastArea() == 5) {
                        Areas.mapArea.setArea(8);
                        Areas.lastArea.setLastArea(10);
                        SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                                + "with a couple of barrels and crates scattered about. "
                                + "There are various symbols on them, "
                                + "they are probably the spoils of many carriage ambushes. "
                                + "There is a way out to the left and to the right.\n");
                    Areas.activateArea();
                    } else if (Areas.lastArea.getLastArea() == 11) {
                        Areas.mapArea.setArea(5);
                        Areas.lastArea.setLastArea(10);
                        SemesterProject.storyOutputTF.appendText("\nA rancid smell fills "
                                + "your nostrils as you enter this room. "
                                + "It appears to be some kind of washroom; although,"
                                + " you aren’t sure if any washing has ever taken place in here. "
                                + "There is a way out of here straight ahead and to the right.\n");
                    Areas.activateArea();
                    } else {
                        SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                    }                    
                }
                break;
            case 11:
                // if came from area 10 set to area 12
                // if came from area 7 set to area 10
                if (Areas.lastArea.getLastArea() == 10) {
                    Areas.mapArea.setArea(12);
                    Areas.lastArea.setLastArea(11);
                    Areas.activateArea();
                    // Escaped!
                    escaped();
                } else if (Areas.lastArea.getLastArea() == 7) {
                    Areas.mapArea.setArea(10);
                    Areas.lastArea.setLastArea(11);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room with "
                            + "several weapons, boxes of food, and some coats lying about. "
                            + "It is slightly cooler in this room than in the rest of this place. "
                            + "There is a way out straight ahead and to the left.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Left.\n");
                }
                break;        
        }
        }
    }
    
    
    public static void goRight() {
        if (Action.getPlayerDead() == false) {
        switch (Areas.mapArea.getArea()) {
            case 0:
                // on start set to area 6
                if (startingMove == false) {
                    if (Areas.lastArea.getLastArea() == 0) {
                        Areas.mapArea.setArea(6);
                        startingMove = true;
                        Areas.lastArea.setLastArea(0);
                        SemesterProject.storyOutputTF.appendText("\nYou enter a room"
                                + " that looks to be a dining area. There is a table "
                                + "with plates of hard bread and bowls of poorly made soup."
                                + " There is a way out straight ahead and to the left.\n");
                    Areas.activateArea();
                    } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                    }
                }
                break;
            case 1:
                // if came from area 0 set to area 2
                if (Areas.lastArea.getLastArea() == 0) {
                    Areas.mapArea.setArea(2);
                    Areas.lastArea.setLastArea(1);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room that"
                            + " seems to be used as a lounging area. "
                            + "There is a door to the left and right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                }
                break;
            case 2:
                // if came from area 1 set to area 4
                // if came from area 3 set to area 1
                if (Areas.lastArea.getLastArea() == 1) {
                    Areas.mapArea.setArea(4);
                    Areas.lastArea.setLastArea(2);
                    SemesterProject.storyOutputTF.appendText("\nYou enter another lounging room."
                            + " This area is larger than the other, but you see no"
                            + " equipment that might be useful."
                            + " There are chairs around a large table with playing "
                            + "cards scattered about."
                            + " There is a doorway out of this room straight ahead and to the left.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 3) {
                    Areas.mapArea.setArea(1);
                    Areas.lastArea.setLastArea(2);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with more cells lining the left wall. "
                            + "A few of them are occupied by other bloody and bruised prisoners."
                            + " There is no way for you to help them. "
                            + "There is a doorway to leave the room to the left.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                }
                break;
            case 3:
                // can't
                SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                break;
            case 4:
                // if came from area 5 set to area 8
                // if came from area 8 set to area 2
                if (Areas.lastArea.getLastArea() == 5) {
                    Areas.mapArea.setArea(8);
                    Areas.lastArea.setLastArea(4);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with a couple of barrels and crates scattered about. "
                            + "There are various symbols on them, "
                            + "they are probably the spoils of many carriage ambushes. "
                            + "There is a way out straight ahead and to the right.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 8) {
                    Areas.mapArea.setArea(2);
                    Areas.lastArea.setLastArea(4);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that seems to be used as a lounging area. "
                            + "There is a door straight ahead and to the left.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                }
                break;
            case 5:
                // if came from area 4 set to area 6
                // if came from area 10 set to area 4
                if (Areas.lastArea.getLastArea() == 4) {
                    Areas.mapArea.setArea(6);
                    Areas.lastArea.setLastArea(5);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that looks to be a dining area."
                            + " There is a table with plates of hard bread and bowls of poorly made soup. "
                            + "There is a way out to the left and to the right.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 10) {
                    Areas.mapArea.setArea(4);
                    Areas.lastArea.setLastArea(5);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a lounging room. "
                            + "There are chairs around a large table with playing cards scattered about. "
                            + "There is a doorway out of this room straight ahead and to the right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                }
                break;
            case 6:
                // if came from area 5 set to area 0
                // if came from area 7 set to area 5
                if (Areas.lastArea.getLastArea() == 5) {
                    Areas.mapArea.setArea(0);
                    Areas.lastArea.setLastArea(6);
                    SemesterProject.storyOutputTF.appendText("\nThis is the cell room that you woke up in. "
                            + "There is a doorway straight ahead and the one you came from.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 7) {
                    Areas.mapArea.setArea(5);
                    Areas.lastArea.setLastArea(6);
                    SemesterProject.storyOutputTF.appendText("\nA rancid smell fills "
                            + "your nostrils as you enter this room. "
                            + "It appears to be some kind of washroom; although,"
                            + " you aren’t sure if any washing has ever taken place in here."
                            + " There is a way out of here straight ahead and to the left.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                }
                break;
            case 7:
                // if came from area 11 set to area 6
                if (Areas.lastArea.getLastArea() == 11) {
                    Areas.mapArea.setArea(6);
                    Areas.lastArea.setLastArea(7);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that looks to be a dining area. "
                            + "There is a table with plates of hard bread and bowls of poorly made soup. "
                            + "There is a way out straight ahead and to the right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                }
                break;
            case 8:
                // if came from area 4 set to area 10
                // if came from area 10 set to area 9
                if (Areas.lastArea.getLastArea() == 4) {
                    Areas.mapArea.setArea(10);
                    Areas.lastArea.setLastArea(8);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with several weapons, boxes of food, and some coats lying about. "
                            + "It is slightly cooler in this room than in the rest of this place."
                            + " There is a way out straight ahead and to the right.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 10) {
                    Areas.mapArea.setArea(9);
                    Areas.lastArea.setLastArea(8);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that looks to serve as a storage area. "
                            + "There are many things strewn about the rickety shelving."
                            + " Mostly useless right now. "
                            + "The only way out is back the way you came.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                }
                break;
            case 9:
                // can't
                SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                break;
            case 10:
                // if came from area 8 set to area 5
                // if came from area 5 set to area 11
                if (Areas.lastArea.getLastArea() == 8) {
                    Areas.mapArea.setArea(5);
                    Areas.lastArea.setLastArea(10);
                    SemesterProject.storyOutputTF.appendText("\nA rancid smell fills"
                            + " your nostrils as you enter this room. "
                            + "It appears to be some kind of washroom; although,"
                            + " you aren’t sure if any washing has ever taken place in here. "
                            + "There is a way out of here straight ahead and to the right.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 5) {
                    Areas.mapArea.setArea(11);
                    Areas.lastArea.setLastArea(10);
                    SemesterProject.storyOutputTF.appendText("\nThis room is cold. "
                            + "You must be close to the exit now. "
                            + "There is a way out to the left and to the right. "
                            + "There are muddy tracks coming from the door to the left.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                }
                break;
            case 11:
                // if came from area 10 set to area 7
                if (Areas.lastArea.getLastArea() == 10) {
                    Areas.mapArea.setArea(7);
                    Areas.lastArea.setLastArea(11);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with several cots lining the walls."
                            + " Like everything else in this place, the beds are dirty and unkept."
                            + " There is a way out to the right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Right.\n");
                }
                break;
        }
        }
    }
    
    
    public static void goStraight() {
        if (Action.getPlayerDead() == false) {
        switch (Areas.mapArea.getArea()) {
            case 0:
                // if came from area 1 set to area 6
                // if came from area 6 set to area 1
                if (Areas.lastArea.getLastArea() == 1) {
                    Areas.mapArea.setArea(6);
                    Areas.lastArea.setLastArea(0);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that looks to be a dining area. "
                            + "There is a table with plates of hard bread and bowls of poorly made soup."
                            + " There is a way out straight ahead and to the left.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 6) {
                    Areas.mapArea.setArea(1);
                    Areas.lastArea.setLastArea(0);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with more cells lining the left wall. "
                            + "A few of them are occupied by other bloody and bruised prisoners. "
                            + "There is no way for you to help them. "
                            + "There is a doorway to leave the room to the right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                }
                break;
            case 1:
                // can't
                SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                break;
            case 2:
                // if came from area 3 set to area 4
                // if came from area 4 set to area 3
                if (Areas.lastArea.getLastArea() == 3) {
                    Areas.mapArea.setArea(4);
                    Areas.lastArea.setLastArea(2);
                    SemesterProject.storyOutputTF.appendText("\nYou enter another lounging room."
                            + " This area is larger than the other, but you see no equipment that might be useful."
                            + " There are chairs around a large table with playing cards scattered about. "
                            + "There is a doorway out of this room straight ahead and to the left.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 4) {
                    Areas.mapArea.setArea(3);
                    Areas.lastArea.setLastArea(2);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with a pile of sacks and barrels in the corner and"
                            + " a disorganized rack of weapons lining the wall. "
                            + "The only way out is back the way you came.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                }
                break;
            case 3:
                // can't
                SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                break;
            case 4:
                // if came from area 2 set to area 5
                // if came from area 5 set to area 2
                if (Areas.lastArea.getLastArea() == 2) {
                    Areas.mapArea.setArea(5);
                    Areas.lastArea.setLastArea(4);
                    SemesterProject.storyOutputTF.appendText("\nA rancid smell fills"
                            + " your nostrils as you enter this room. "
                            + "It appears to be some kind of washroom; although, "
                            + "you aren’t sure if any washing has ever taken place in here. "
                            + "There is a way out of here to the left and to the right.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 5) {
                    Areas.mapArea.setArea(2);
                    Areas.lastArea.setLastArea(4);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that seems to be used as a lounging area. "
                            + "There is a door straight ahead and to the left.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                }
                break;
            case 5:
                // if came from area 6 set to area 10
                // if came from area 10 set to area 6
                if (Areas.lastArea.getLastArea() == 6) {
                    Areas.mapArea.setArea(10);
                    Areas.lastArea.setLastArea(5);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with several weapons, boxes of food, and some coats lying about."
                            + " It is slightly cooler in this room than in the rest of this place. "
                            + "There is a way out to the left and to the right.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 10) {
                    Areas.mapArea.setArea(6);
                    Areas.lastArea.setLastArea(5);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that looks to be a dining area. "
                            + "There is a table with plates of hard bread and bowls of poorly made soup."
                            + " There is a way out to the left and to the right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                }
                break;
            case 6:
                // if came from area 0 set to area 7
                // if came from area 7 set to area 0
                if (Areas.lastArea.getLastArea() == 0) {
                    Areas.mapArea.setArea(7);
                    Areas.lastArea.setLastArea(6);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with several cots lining the walls. "
                            + "Like everything else in this place, the beds are dirty and unkept."
                            + " There is a way out to the left.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 7) {
                    Areas.mapArea.setArea(0);
                    Areas.lastArea.setLastArea(6);
                    SemesterProject.storyOutputTF.appendText("\nThis is the cell"
                            + " room that you woke up in. "
                            + "There is a doorway straight ahead and the one you came from.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                }
                break;
            case 7:
                // can't
                SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                break;
            case 8:
                // if came from area 4 set to area 9
                // if came from area 9 set to area 4
                if (Areas.lastArea.getLastArea() == 4) {
                    Areas.mapArea.setArea(9);
                    Areas.lastArea.setLastArea(8);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that looks to serve as a storage area. "
                            + "There are many things strewn about the rickety shelving. "
                            + "Mostly useless right now. "
                            + "The only way out is back the way you came.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 9) {
                    Areas.mapArea.setArea(4);
                    Areas.lastArea.setLastArea(8);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a lounging room."
                            + " There are chairs around a large table with playing cards scattered about. "
                            + "There is a doorway out of this room to the left and to the right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                }
                break;
            case 9:
                // can't
                SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                break;
            case 10:
                // if came from area 8 set to area 11
                // if came from area 11 set to area 8
                if (Areas.lastArea.getLastArea() == 8) {
                    Areas.mapArea.setArea(11);
                    Areas.lastArea.setLastArea(10);
                    SemesterProject.storyOutputTF.appendText("\nThis room is cold. "
                            + "You must be close to the exit now."
                            + " There is a way out to the left and to the right. "
                            + "There are muddy tracks coming from the door to the left.\n");
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 11) {
                    Areas.mapArea.setArea(8);
                    Areas.lastArea.setLastArea(10);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with a couple of barrels and crates scattered about. "
                            + "There are various symbols on them, "
                            + "they are probably the spoils of many carriage ambushes. "
                            + "There is a way out to the left and to the right.\n");
                    Areas.activateArea();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                }
                break;
            case 11:
                // if came from area 7 set to area 12
                if (Areas.lastArea.getLastArea() == 7) {
                    Areas.mapArea.setArea(12);
                    Areas.lastArea.setLastArea(11);
                    Areas.activateArea();
                    // Escaped!
                    escaped();
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCan't go Straight.\n");
                }
                break;
        }
        }
    }
    
    
    public static void goBack() {
        if (Action.getPlayerDead() == false) {
        // set mapArea to lastArea unless at area 12
        if (startingMove == false) {
            SemesterProject.storyOutputTF.appendText("\nDon't go back in the cell...\n");            
        }
        switch (Areas.mapArea.getArea()) {
            case 0:
                // if came from 1
                // if came from 6
                if (Areas.lastArea.getLastArea() == 1) {
                    Areas.lastArea.setLastArea(0);
                    Areas.mapArea.setArea(1);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with more cells lining the left wall. "
                            + "A few of them are occupied by other bloody and bruised prisoners. "
                            + "There is no way for you to help them. "
                            + "There is a doorway to leave the room to the right.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 6) {
                    Areas.lastArea.setLastArea(0);
                    Areas.mapArea.setArea(6);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that looks to be a dining area. "
                            + "There is a table with plates of hard bread and bowls of poorly made soup."
                            + " There is a way out straight ahead and to the left.\n"); 
                    Areas.activateArea();
                }
                break;
            case 1:
                // if came from 0
                // if came from 2
                if (Areas.lastArea.getLastArea() == 0) {
                    Areas.lastArea.setLastArea(1);
                    Areas.mapArea.setArea(0);
                    SemesterProject.storyOutputTF.appendText("\nThis is the cell "
                            + "room that you woke up in. "
                            + "There is a doorway straight ahead and the one you came from.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 2) {
                    Areas.lastArea.setLastArea(1);
                    Areas.mapArea.setArea(2);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that seems to be used as a lounging area. "
                            + "There is a door to the left and right.\n"); 
                    Areas.activateArea();
                }
                break;
            case 2:
                // if came from 1
                // if came from 3
                // if came from 4
                if (Areas.lastArea.getLastArea() == 1) {
                    Areas.lastArea.setLastArea(2);
                    Areas.mapArea.setArea(1);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with more cells lining the left wall. "
                            + "A few of them are occupied by other bloody and bruised prisoners. "
                            + "There is no way for you to help them. "
                            + "There is a doorway to leave the room to the left.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 3) {
                    Areas.lastArea.setLastArea(2);
                    Areas.mapArea.setArea(3);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with a pile of sacks and barrels in the corner and "
                            + "a disorganized rack of weapons lining the wall. "
                            + "The only way out is back the way you came.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 4) {
                    Areas.lastArea.setLastArea(2);
                    Areas.mapArea.setArea(4);
                    SemesterProject.storyOutputTF.appendText("\nYou enter another lounging room. "
                            + "This area is larger than the other, but you see no equipment that might be useful. "
                            + "There are chairs around a large table with playing cards scattered about."
                            + " There is a doorway out of this room straight ahead and to the left.\n"); 
                    Areas.activateArea();
                }
                break;
            case 3:
                // if came from 2
                if (Areas.lastArea.getLastArea() == 2) {
                    Areas.lastArea.setLastArea(3);
                    Areas.mapArea.setArea(2);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that seems to be used as a lounging area. "
                            + "There is a door straight ahead and to the right.\n"); 
                    Areas.activateArea();
                }
                break;
            case 4:
                // if came from 2
                // if came from 5
                // if came from 8
                if (Areas.lastArea.getLastArea() == 2) {
                    Areas.lastArea.setLastArea(4);
                    Areas.mapArea.setArea(2);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that seems to be used as a lounging area. "
                            + "There is a door straight ahead and to the left.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 5) {
                    Areas.lastArea.setLastArea(4);
                    Areas.mapArea.setArea(5);
                    SemesterProject.storyOutputTF.appendText("\nA rancid smell fills "
                            + "your nostrils as you enter this room. "
                            + "It appears to be some kind of washroom; although,"
                            + " you aren’t sure if any washing has ever taken place in here. "
                            + "There is a way out of here to the left and to the right.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 8) {
                    Areas.lastArea.setLastArea(4);
                    Areas.mapArea.setArea(8);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with a couple of barrels and crates scattered about. "
                            + "There are various symbols on them, they are probably "
                            + "the spoils of many carriage ambushes. "
                            + "There is a way out straight ahead and to the right.\n"); 
                    Areas.activateArea();
                }
                break;
            case 5:
                // if came from 4
                // if came from 6
                // if came from 10
                if (Areas.lastArea.getLastArea() == 4) {
                    Areas.lastArea.setLastArea(5);
                    Areas.mapArea.setArea(4);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a lounging room."
                            + " There are chairs around a large table with playing cards scattered about."
                            + " There is a doorway out of this room straight ahead and to the right.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 6) {
                    Areas.lastArea.setLastArea(5);
                    Areas.mapArea.setArea(6);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that looks to be a dining area. "
                            + "There is a table with plates of hard bread and bowls of poorly made soup."
                            + " There is a way out to the left and to the right.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 10) {
                    Areas.lastArea.setLastArea(5);
                    Areas.mapArea.setArea(10);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with several weapons, boxes of food, and some coats lying about."
                            + " It is slightly cooler in this room than in the rest of this place. "
                            + "There is a way out to the left and to the right.\n"); 
                    Areas.activateArea();
                }
                break;
            case 6:
                // if came from 0
                // if came from 5
                // if came from 7
                if (Areas.lastArea.getLastArea() == 0) {
                    Areas.lastArea.setLastArea(6);
                    Areas.mapArea.setArea(0);
                    SemesterProject.storyOutputTF.appendText("\nThis is the cell room that you woke up in."
                            + " There is a doorway straight ahead and the one you came from.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 5) {
                    Areas.lastArea.setLastArea(6);
                    Areas.mapArea.setArea(5);
                    SemesterProject.storyOutputTF.appendText("\nA rancid smell fills "
                            + "your nostrils as you enter this room. "
                            + "It appears to be some kind of washroom; although, "
                            + "you aren’t sure if any washing has ever taken place in here. "
                            + "There is a way out of here straight ahead and to the left.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 7) {
                    Areas.lastArea.setLastArea(6);
                    Areas.mapArea.setArea(7);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room with several cots lining the walls. "
                            + "Like everything else in this place, the beds are dirty and unkept. "
                            + "There is a way out to the left.\n"); 
                    Areas.activateArea();
                }
                break;
            case 7:
                // if came from 6
                // if came from 11
                if (Areas.lastArea.getLastArea() == 6) {
                    Areas.lastArea.setLastArea(7);
                    Areas.mapArea.setArea(6);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room that looks to be a dining area. "
                            + "There is a table with plates of hard bread and bowls of poorly made soup. "
                            + "There is a way out straight ahead and to the right.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 11) {
                    Areas.lastArea.setLastArea(7);
                    Areas.mapArea.setArea(11);
                    SemesterProject.storyOutputTF.appendText("\nThis room is cold. "
                            + "You must be close to the exit now. "
                            + "There is a way out straight ahead and to the left. "
                            + "There are muddy tracks coming from the door straight ahead of you.\n"); 
                    Areas.activateArea();
                }
                break;
            case 8:
                // if came from 4
                // if came from 9
                // if came from 10
                if (Areas.lastArea.getLastArea() == 4) {
                    Areas.lastArea.setLastArea(8);
                    Areas.mapArea.setArea(4);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a lounging room. "
                            + "There are chairs around a large table with playing cards scattered about. "
                            + "There is a doorway out of this room to the left and to the right.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 9) {
                    Areas.lastArea.setLastArea(8);
                    Areas.mapArea.setArea(9);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "that looks to serve as a storage area. "
                            + "There are many things strewn about the rickety shelving. "
                            + "Mostly useless right now. The only way out is back the way you came.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 10) {
                    Areas.lastArea.setLastArea(8);
                    Areas.mapArea.setArea(10);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with several weapons, boxes of food, and some coats lying about."
                            + " It is slightly cooler in this room than in the rest of this place. "
                            + "There is a way out straight ahead and to the right.\n"); 
                    Areas.activateArea();
                }
                break;
            case 9:
                // if came from 8
                if (Areas.lastArea.getLastArea() == 8) {
                    Areas.lastArea.setLastArea(9);
                    Areas.mapArea.setArea(8);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with a couple of barrels and crates scattered about. "
                            + "There are various symbols on them, they are probably "
                            + "the spoils of many carriage ambushes. "
                            + "There is a way out straight ahead and to the left.\n"); 
                    Areas.activateArea();
                }
                break;
            case 10:
                // if came from 5
                // if came from 8
                // if came from 11
                if (Areas.lastArea.getLastArea() == 5) {
                    Areas.lastArea.setLastArea(10);
                    Areas.mapArea.setArea(5);
                    SemesterProject.storyOutputTF.appendText("\nA rancid smell fills"
                            + " your nostrils as you enter this room. "
                            + "It appears to be some kind of washroom; although, "
                            + "you aren’t sure if any washing has ever taken place in here. "
                            + "There is a way out of here straight ahead and to the right.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 8) {
                    Areas.lastArea.setLastArea(10);
                    Areas.mapArea.setArea(8);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with a couple of barrels and crates scattered about. "
                            + "There are various symbols on them, they are probably"
                            + " the spoils of many carriage ambushes. "
                            + "There is a way out to the left and to the right.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 11) {
                    Areas.lastArea.setLastArea(10);
                    Areas.mapArea.setArea(11);
                    SemesterProject.storyOutputTF.appendText("\nThis room is cold."
                            + " You must be close to the exit now. "
                            + "There is a way out to the left and to the right. "
                            + "There are muddy tracks coming from the door to the left.\n"); 
                    Areas.activateArea();
                }
                break;
            case 11:
                // if came from 7
                // if came from 10
                if (Areas.lastArea.getLastArea() == 7) {
                    Areas.lastArea.setLastArea(11);
                    Areas.mapArea.setArea(7);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room "
                            + "with several cots lining the walls."
                            + " Like everything else in this place, the beds are dirty and unkept."
                            + " There is a way out to the right.\n"); 
                    Areas.activateArea();
                } else if (Areas.lastArea.getLastArea() == 10) {
                    Areas.lastArea.setLastArea(11);
                    Areas.mapArea.setArea(10);
                    SemesterProject.storyOutputTF.appendText("\nYou enter a room"
                            + " with several weapons, boxes of food, and some coats lying about."
                            + " It is slightly cooler in this room than in the rest of this place. "
                            + "There is a way out straight ahead and to the left.\n"); 
                    Areas.activateArea();
                }
                break;                   
        }
        }
    }
    
    
    public static void attack() {
        if (Action.getPlayerDead() == false) {
        switch (Areas.mapArea.getArea()) {
            case 6:
                if (orc1StatsSet == false) {
                    Areas.orc1.setOrcStats();  
                    enemyHealth = getEnemyHealth();
                    enemyAttack = getEnemyAttackPower();
                    enemySpeed = getEnemySpeed();
                    orc1StatsSet = true;
                }                
                break;
            case 7:
                if (orc2StatsSet == false) {
                    Areas.orc2.setOrcStats();  
                    enemyHealth = getEnemyHealth();
                    enemyAttack = getEnemyAttackPower();
                    enemySpeed = getEnemySpeed();
                    orc2StatsSet = true;
                }   
                break;
            case 8:
                if (goblin1StatsSet == false) {
                    Areas.goblin1.setGoblinStats();  
                    enemyHealth = getEnemyHealth();
                    enemyAttack = getEnemyAttackPower();
                    enemySpeed = getEnemySpeed();
                    goblin1StatsSet = true;
                }   
                break;
            case 10:
                if (orc3StatsSet == false) {
                    Areas.orc3.setOrcStats();  
                    enemyHealth = getEnemyHealth();
                    enemyAttack = getEnemyAttackPower();
                    enemySpeed = getEnemySpeed();
                    orc3StatsSet = true;
                }   
                break;
            
        }
        if ((enemyHealth > 0) && (characterHealth > 0)) {
            int characterAttackDamage;
            int enemyAttackDamage;
            
            if (characterSpeed < enemySpeed) {
                characterAttackDamage = characterAttack;
                enemyAttackDamage = enemyAttack * 2;
            } else if (characterSpeed > enemySpeed){
                characterAttackDamage = characterAttack * 2;
                enemyAttackDamage = enemyAttack;
            } else {
                characterAttackDamage = characterAttack;
                enemyAttackDamage = enemyAttack;
            }            
            enemyHealth -= characterAttackDamage;
            setEnemyHealth(enemyHealth);
            Action.changeCharacterHealth(-enemyAttackDamage);
            SemesterProject.storyOutputTF.appendText("\nDealt " + characterAttackDamage + " damage\n");
            SemesterProject.storyOutputTF.appendText("\nFoe has " + enemyHealth + " health remaining.\n");
        } else if (enemyHealth <= 0) {
            isEnemyDead();
        } else if (characterHealth <= 0) {
            isCharacterDead();
        }
        }
    }
    
    
    public static void run() {
        if (Action.getPlayerDead() == false) {
        if ((Areas.mapArea.getArea() == 6) || (Areas.mapArea.getArea() == 7) 
                || (Areas.mapArea.getArea() == 8) || (Areas.mapArea.getArea() == 10)) {
            
            int runChance = (int) (Math.random()*100);
            SemesterProject.storyOutputTF.appendText("\nRun Chance: " + runChance + "%\n");
            if (characterSpeed < enemySpeed) {
                if (runChance > 75 ) {
                    gotAway(true);
                    SemesterProject.storyOutputTF.appendText("\nGot away!\n");
                    
                    SemesterProject.storyOutputTF.appendText("\nCouldn't get away!\n");
                    attack();
                }            
            }
            
            if (characterSpeed > enemySpeed) {
                if (runChance > 25) {
                    gotAway(true);
                    SemesterProject.storyOutputTF.appendText("\nGot away!\n");
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCouldn't get away!\n");
                    attack();
                }
            }
            
            if (characterSpeed == enemySpeed) {
                if (runChance <= 50) {
                    gotAway(true);
                    SemesterProject.storyOutputTF.appendText("\nGot away!\n");
                } else {
                    SemesterProject.storyOutputTF.appendText("\nCouldn't get away!\n");
                    attack();
                }            
            }            
        }        
    }
    }
    
    
    public static boolean gotAway(boolean run) {
         if (run = true) {
             // get rid of enemy
             switch (Areas.mapArea.getArea()) {
                case 6:
                    SemesterProject.storyOutputTF.appendText("\nYou ran away from the orc!\n");
                    break;
                case 7:
                    SemesterProject.storyOutputTF.appendText("\nYou ran away from the orc!\n");
                    break;
                case 8:
                    SemesterProject.storyOutputTF.appendText("\nYou ran away from the goblin!\n");
                    break;
                case 10:
                    SemesterProject.storyOutputTF.appendText("\nYou ran away from the orc!\n");
                    break;
            }
             characterHealth += 5;
             setCharacterHealth(characterHealth);
         }
        return run;
    }
    
    
    public static void isCharacterDead() {
            // output that character is dead
            // end the game or restart
            SemesterProject.storyOutputTF.appendText("\nYou Died!\n");
            SemesterProject.storyOutputTF.appendText("\nExit the game and restart to try again!\n");
            setPlayerDead(true);
    }
    
    
    public static void isEnemyDead() {
            // get rid of enemy
            // output that enemy is dead
            switch (Areas.mapArea.getArea()) {
                case 6:
                    Areas.orc1 = null;
                    SemesterProject.storyOutputTF.appendText("\nYou killed the orc!\n");
                    break;
                case 7:
                    Areas.orc2 = null;
                    SemesterProject.storyOutputTF.appendText("\nYou killed the orc!\n");
                    break;
                case 8:
                    Areas.goblin1 = null;
                    SemesterProject.storyOutputTF.appendText("\nYou killed the goblin!\n");
                    break;
                case 10:
                    Areas.orc3 = null;
                    SemesterProject.storyOutputTF.appendText("\nYou killed the orc!\n");
                    break;
            }
    }
    
    
    public static void escaped() {
        // set end game message
        SemesterProject.storyOutputTF.appendText("\nYou escaped the dungeon!\n");   
        Escape.newAction = null;            
    }
}
