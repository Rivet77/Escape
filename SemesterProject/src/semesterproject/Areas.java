// IvyTech Dungeon Game
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;


import java.io.File;
import java.util.Random;

import javafx.scene.image.Image;


public class Areas {
	// global variables
    private static int currentArea;
    private static int lastArea;
    private static String[] itemNames = {"Dagger","Longsword","Buckler","Plate Armor","Leather Armor","Thief Idol","Berserker Stone",
										"Great Axe","Nibbles, the House Cat","Priestly Vestments","Rapier","Hammer","Well-Crafted Boots",
										"Assassin Gloves","Spiffy Hat","Sack Lunch","Embarrassing Photos","Some Self-Esteem",
										"Miniature Mother-in-Law","Elven Nutcracker","Vorpal Sword","Yoga Pants","Book of Mormon",
										"Gladius, Fair Broadsword"};
	private static String itemName = "";
    private static boolean[] beenTo = new boolean[26];
    private static boolean[] hasItem = new boolean[26];
    private static boolean[] gottenItem = new boolean[26];
    private static boolean[] enemiesDead = new boolean[26];
    private static Areas[] roomsArray = new Areas[26];
    private static File roomImagePath;
	private static int hpChange;
	private static int atkChange;
	private static int spdChange;
	private static Random randomGenerator = new Random();
	private static FantasyRace enemy;
    
    
	// constructors
	Areas() {
		
	}
	Areas(int roomNum) {
		int area = roomNum;
		// check if hey have been to the room before
		// if not, determine if this room has an item and set enemies
		if (!beenTo[area]) {
			determineIfHasItem(area);
			generateEnemies(area);
			setBeenTo(area);
			setRoomImage(area);
		}
		// If the room has an item, check if the player has gotten the item. If not, set the item.
		if ((hasItem[area]) && (!gottenItem[area])) {
			int itemNum = randomGenerator.nextInt(24) + 0;
			setItemName(itemNum); // get item name from array of item names
		}
		System.out.println("Area " + roomNum + " Created.");
	}
    
	
    // getters
    public static int getArea() {
        return currentArea;
    }
    public static int getLastArea() {
        return lastArea;
    }
    public static String getItemName() {
    	return itemName;
    }
    public static boolean getEnemiesDead(int roomNum) {
    	return enemiesDead[roomNum];
    }
    
    
    //setters
    public static void setArea(int newArea) {
        currentArea = newArea;
    }
    public static void setLastArea(int newArea) {
        lastArea = newArea;
    }
    public static void setBeenTo(int roomNum) {
    	beenTo[roomNum] = true;
    }
    public static void setHasItem(int roomNum) {
    	hasItem[roomNum] = true;
    }
    public static void setGottenItem(int roomNum) {
    	gottenItem[roomNum] = true;
    }
    private static void setItemName(int itemNum) {
    	itemName = itemNames[itemNum];
    }
    private static void setRoomImage(int roomNum) {
    	roomImagePath = new File(("semesterProject/mapRooms/room") + (Integer.toString(roomNum)) + (".jpg"));
    	String roomImagePathString = roomImagePath.toString();
    	Image RoomPic = new Image(roomImagePathString);
    	SemesterProject.mapIV.setImage(RoomPic);
    }
    public static void setEnemiesDead(int roomNum) {
    	enemiesDead[roomNum] = true;
    }
    
    
    // If its the first time to that room:
    	// Create new Areas object for the room and display the first-time-to-room message
    	// Display first time area message
    // If not the first time to the room, set room image and message
    public static void activateArea() {
    	switch (getArea()) {
    		case 0:
    			if (!beenTo[0]) {
        			roomsArray[0] = new Areas(0);
        			// game start message
    				SemesterProject.storyOutputTF.appendText("\nYou see a cave entrance hidden behind some trees "
    						+ "and brush. The stench emanating from the entrance is a sure sign that it is "
    						+ "infested with goblins. Goblins always collect great treasures, but they never "
    						+ "travel alone. There is sure to be tougher things than goblins within the cave. "
    						+ "\nGo North to proceed.\n");
    			} else {
    				setRoomImage(currentArea);
    			}
    			break;
    		case 1:
    			if (!beenTo[1]) {
    				roomsArray[1] = new Areas(1);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 1\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 1\n");
    			}
                break;
            case 2:              
            	if (!beenTo[2]) {
            		roomsArray[2] = new Areas(2);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 2\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 2\n");
    			}
                break;
            case 3:               
            	if (!beenTo[3]) {
            		roomsArray[3] = new Areas(3);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 3\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 3\n");
    			}
                break;
            case 4:
            	if (!beenTo[4]) {
            		roomsArray[4] = new Areas(4);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 4\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 4\n");
    			}
                break;
            case 5:
            	if (!beenTo[5]) {
            		roomsArray[5] = new Areas(5);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 5\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 5\n");
    			}
                break;
            case 6:                
            	if (!beenTo[6]) {
            		roomsArray[6] = new Areas(6);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 6\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 6\n");
    			}
                break;
            case 7:               
            	if (!beenTo[7]) {
            		roomsArray[7] = new Areas(7);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 7\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 7\n");
    			}
                break;
            case 8:               
            	if (!beenTo[8]) {
            		roomsArray[8] = new Areas(8);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 8\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 8\n");
    			}
                break;
            case 9:                
            	if (!beenTo[9]) {
            		roomsArray[9] = new Areas(9);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 9\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 9\n");
    			}
                break;
            case 10:               
            	if (!beenTo[10]) {
            		roomsArray[10] = new Areas(10);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 10\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 10\n");
    			}
                break;
            case 11:
            	if (!beenTo[11]) {
            		roomsArray[11] = new Areas(11);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 11\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 11\n");
    			}
                break;
            case 12:
            	if (!beenTo[12]) {
            		roomsArray[12] = new Areas(12);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 12\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 12\n");
    			}
                break;
            case 13:
            	if (!beenTo[13]) {
            		roomsArray[13] = new Areas(13);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 13\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 13\n");
    			}
                break;
            case 14:
            	if (!beenTo[14]) {
            		roomsArray[14] = new Areas(14);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 14\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 14\n");
    			}
                break;
            case 15:
            	if (!beenTo[15]) {
            		roomsArray[15] = new Areas(15);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 15\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 15\n");
    			}
                break;
            case 16:
            	if (!beenTo[16]) {
            		roomsArray[16] = new Areas(16);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 16\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 16\n");
    			}
                break;
            case 17:
                if (!beenTo[17]) {
                	roomsArray[17] = new Areas(17);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 17\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 17\n");
    			}
                break;
            case 18:
                if (!beenTo[18]) {
                	roomsArray[18] = new Areas(18);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 18\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 18\n");
    			}
                break;
            case 19:
                if (!beenTo[19]) {
                	roomsArray[19] = new Areas(19);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 19\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 19\n");
    			}
                break;
            case 20:
                if (!beenTo[20]) {
                	roomsArray[20] = new Areas(20);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 20\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 20\n");
    			}
                break;
            case 21:
                if (!beenTo[21]) {
                	roomsArray[21] = new Areas(21);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 21\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 21\n");
    			}
                break;
            case 22:
                if (!beenTo[22]) {
                	roomsArray[22] = new Areas(22);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 22\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 22\n");
    			}
                break;
            case 23:
                if (!beenTo[23]) {
                	roomsArray[23] = new Areas(23);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 23\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 23\n");
    			}
                break;
            case 24:
                if (!beenTo[24]) {
                	roomsArray[24] = new Areas(24);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 24\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 24\n");
    			}
                break;
            case 25:
                if (!beenTo[25]) {
                	roomsArray[25] = new Areas(25);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 25\n");
    			} else {
    				setRoomImage(currentArea);
        			// area message
        			SemesterProject.storyOutputTF.appendText("\nArea 25\n");
    			}
                break;
            }
    }
    
    
    private void determineIfHasItem(int roomNum) {
    	if (getArea() != 0) {
    		int percentChance = (int) Math.ceil(Math.random()*100);
        	if (percentChance > 20) {
        		setHasItem(roomNum);
        		System.out.println("Item Here: ");
        	}
    	}
    }
    
  public static void generateEnemies(int roomNum) {    	
    	if (roomsArray[roomNum] != roomsArray[0]) {
    		// code to set the enemies for the specific room -----------------------------------------------
    		int randomInt = randomGenerator.nextInt(3) + 1;
    		switch (randomInt) {
    		case 1:
    			enemy = new Orc();
    			break;
    		case 2:
    			enemy = new Goblin();
    			break;
    		case 3:
    			enemy = new Ogre();
    			break;
    		}
    		System.out.println("Enemies Here: ");
    	} else if (roomsArray[roomNum] == roomsArray[11]) {
    		// set boss room enemy--------------------------------------------------------------------------
    		enemy = new Boss();
    	}
    	
    }
    
    private void pickUpItem(int roomNum) {
    	String item = getItemName();
    	// code to set the stats for the specific item ---------------------------------------------------------
    	switch (item) {
			case "Dagger":
				hpChange=0;
				atkChange=1;
				spdChange=1;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked up a Dagger. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Longsword":
				hpChange=0;
				atkChange=3;
				spdChange=0;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up a Longsword. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Buckler":
				hpChange=3;
				atkChange=0;
				spdChange=0;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up a Buckler. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Plate Armor":
				hpChange=5;
				atkChange=0;
				spdChange=-2;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Plate Armor. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Leather Armor":
				hpChange=2;
				atkChange=0;
				spdChange=2;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Leather Armor. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Thief Idol":
				hpChange=0;
				atkChange=2;
				spdChange=4;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Thief Idol. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Berserker Stone":
				hpChange=-5;
				atkChange=10;
				spdChange=3;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Berserker Stone. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Great Axe":
				hpChange=0;
				atkChange=5;
				spdChange=-2;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up a Great Axe. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Nibbles, the House Cat":
				hpChange=1;
				atkChange=1;
				spdChange=1;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Nibbles, the House Cat. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Priestly Vestments":
				hpChange=10;
				atkChange=-5;
				spdChange=0;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Priestly Vestments. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Rapier":
				hpChange=0;
				atkChange=3;
				spdChange=3;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up a Rapier. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Hammer":
				hpChange=0;
				atkChange=2;
				spdChange=0;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up a Hammer. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Well-Crafted Boots":
				hpChange=1;
				atkChange=0;
				spdChange=3;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Some Well-Crafted Boots. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Assassin Gloves":
				hpChange=0;
				atkChange=3;
				spdChange=5;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Assassin Gloves. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Spiffy Hat":
				hpChange=2;
				atkChange=2;
				spdChange=2;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up a Spiffy Hat. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Sack Lunch":
				hpChange=5;
				atkChange=0;
				spdChange=0;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up a Sack Lunch. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Embarrassing Photos":
				hpChange=-3;
				atkChange=-3;
				spdChange=3;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Some Embarrassing Photos. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Some Self-Esteem":
				hpChange=5;
				atkChange=5;
				spdChange=5;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Some Self-Esteem. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Miniature Mother-in-Law": 
				hpChange=3;
				atkChange=-3;
				spdChange=-5;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Your Miniature Mother-in-Law. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Elven Nutcracker":
				hpChange=0;
				atkChange=1;
				spdChange=0;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Elven Nutcracker. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Vorpal Sword":
				hpChange=0;
				atkChange=5;
				spdChange=7;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Vorpal Sword. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Yoga Pants":
				hpChange=1;
				atkChange=0;
				spdChange=5;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Yoga Pants. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Book of Mormon":
				hpChange=0;
				atkChange=0;
				spdChange=0;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Book of Mormon. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
			case "Gladius, Fair Broadsword":
				hpChange=1;
				atkChange=8;
				spdChange=3;
				Action.changeCharacterHealth(hpChange);
				Action.changeCharacterAttack(atkChange);
				Action.changeCharacterSpeed(spdChange);
				System.out.println("Picked Up Gladius, Fair Broadsword. Stats Added: " + hpChange + " HP " + atkChange + " ATK " + spdChange + " SPD");
				break;
		}
    	setGottenItem(roomNum);
    	
    }
}
