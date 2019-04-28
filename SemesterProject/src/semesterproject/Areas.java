// -- Project Name --
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;

import javafx.scene.image.Image;

public class Areas {
	// global variables
    private static int currentArea;
    private static int lastArea;
    private static String itemName = "";
    private static boolean[] beenTo = new boolean[26];
    private static boolean[] hasItem = new boolean[26];
    private static boolean[] gottenItem = new boolean[26];
    private static Areas[] roomsArray = new Areas[26];
    private static String roomImagePath = "semesterProject/mapRooms/room";
    private static Image roomPic = new Image(roomImagePath + currentArea);
    
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
		}
		// If the room has an item, check if the player has gotten the item. If not, set the item.
		if ((hasItem[area]) && (!gottenItem[area])) {
			setItemName("itemNameHere"); // get item name from array of item names
		}
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
    private static void setItemName(String item) {
    	itemName = item;
    }
    
    
    // If its the first time to that room:
    	// Create new Areas object for the room and display the first-time-to-room message
    	// Display first time area message
    // If not the first time to the room, set room image and message
    public static void activateArea() {
		SemesterProject.mapIV.setImage(roomPic);
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
    			}    			
    			break;
    		case 1:
    			if (!beenTo[1]) {
    				roomsArray[1] = new Areas(1);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 1\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 1\n");
                break;
            case 2:              
            	if (!beenTo[2]) {
            		roomsArray[2] = new Areas(2);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 2\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 2\n");
                break;
            case 3:               
            	if (!beenTo[3]) {
            		roomsArray[3] = new Areas(3);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 3\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 3\n");
                break;
            case 4:
            	if (!beenTo[4]) {
            		roomsArray[4] = new Areas(4);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 4\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 4\n");
                break;
            case 5:
            	if (!beenTo[5]) {
            		roomsArray[5] = new Areas(5);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 5\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 5\n");
                break;
            case 6:                
            	if (!beenTo[6]) {
            		roomsArray[6] = new Areas(6);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 6\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 6\n");
                break;
            case 7:               
            	if (!beenTo[7]) {
            		roomsArray[7] = new Areas(7);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 7\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 7\n");
                break;
            case 8:               
            	if (!beenTo[8]) {
            		roomsArray[8] = new Areas(8);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 8\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 8\n");
                break;
            case 9:                
            	if (!beenTo[9]) {
            		roomsArray[9] = new Areas(9);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 9\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 9\n");
                break;
            case 10:               
            	if (!beenTo[10]) {
            		roomsArray[10] = new Areas(10);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 10\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 10\n");
                break;
            case 11:
            	if (!beenTo[11]) {
            		roomsArray[11] = new Areas(11);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 11\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 11\n");
                break;
            case 12:
            	if (!beenTo[12]) {
            		roomsArray[12] = new Areas(12);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 12\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 12\n");
                break;
            case 13:
            	if (!beenTo[13]) {
            		roomsArray[13] = new Areas(13);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 13\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 13\n");
                break;
            case 14:
            	if (!beenTo[14]) {
            		roomsArray[14] = new Areas(14);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 14\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 14\n");
                break;
            case 15:
            	if (!beenTo[15]) {
            		roomsArray[15] = new Areas(15);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 15\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 15\n");
                break;
            case 16:
            	if (!beenTo[16]) {
            		roomsArray[16] = new Areas(16);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 16\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 16\n");
                break;
            case 17:
                if (!beenTo[17]) {
                	roomsArray[17] = new Areas(17);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 17\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 17\n");
                break;
            case 18:
                if (!beenTo[18]) {
                	roomsArray[18] = new Areas(18);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 18\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 18\n");
                break;
            case 19:
                if (!beenTo[19]) {
                	roomsArray[19] = new Areas(19);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 19\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 19\n");
                break;
            case 20:
                if (!beenTo[20]) {
                	roomsArray[20] = new Areas(20);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 20\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 20\n");
                break;
            case 21:
                if (!beenTo[21]) {
                	roomsArray[21] = new Areas(21);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 21\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 21\n");
                break;
            case 22:
                if (!beenTo[22]) {
                	roomsArray[22] = new Areas(22);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 22\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 22\n");
                break;
            case 23:
                if (!beenTo[23]) {
                	roomsArray[23] = new Areas(23);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 23\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 23\n");
                break;
            case 24:
                if (!beenTo[24]) {
                	roomsArray[24] = new Areas(24);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 24\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 24\n");
                break;
            case 25:
                if (!beenTo[25]) {
                	roomsArray[25] = new Areas(25);
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 25\n");
    			}
    			// area message
    			SemesterProject.storyOutputTF.appendText("\nArea 25\n");
                break;
            }
    }
    
    
    private void determineIfHasItem(int roomNum) {
    	if (getArea() != 0) {
    		int percentChance = (int) Math.ceil(Math.random()*100);
        	if (percentChance > 20) {
        		setHasItem(roomNum);
        	}
    	}
    }
    
    public static void generateEnemies(int roomNum) {
    	// code to set the enemies for the specific room -------------------------------------------------------
    }
    
    private void pickUpItem(int roomNum) {
    	String item = getItemName();
    	// code to set the stats for the specific item ---------------------------------------------------------
    	
    	setGottenItem(roomNum);
    }
    
}
