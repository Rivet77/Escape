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
    //first time to area boolean
    static boolean beenTo1;
    static boolean beenTo2;
    static boolean beenTo3;
    static boolean beenTo4;
    static boolean beenTo5;
    static boolean beenTo6;
    static boolean beenTo7;
    static boolean beenTo8;
    static boolean beenTo9;
    static boolean beenTo10;
    static boolean beenTo11;
    static boolean beenTo12;
    static boolean beenTo13;
    static boolean beenTo14;
    static boolean beenTo15;
    static boolean beenTo16;
    static boolean beenTo17;
    // room images
    static Image room0 = new Image("semesterProject/mapRooms/room0.jpg");
    static Image room4 = new Image("semesterProject/mapRooms/floor1.jpg");
    
    // getters
    public static int getArea() {
        return currentArea;
    }
    public static int getLastArea() {
        return lastArea;
    }
    
    //setters
    public static void setArea(int newArea) {
        currentArea = newArea;
    }
    public static void setLastArea(int newArea) {
        lastArea = newArea;
    }
    
    
    // Display image
    // Determine if the player has been to the area before. 
    // If not, display the first-time visit message.
    public static void activateArea() {
    	switch (getArea()) {
    		case 0:
    	    	SemesterProject.mapIV.setImage(room0);
    			// game start message    		
				SemesterProject.storyOutputTF.appendText("\nYou see a cave entrance hidden behind some trees "
						+ "and brush. The stench emanating from the entrance is a sure sign that it is "
						+ "infested with goblins. Goblins always collect great treasures, but they never "
						+ "travel alone. There is sure to be tougher things than goblins within the cave. "
						+ "\nGo North to proceed.\n");
    			break;
    		case 1:
    			if (beenTo1) {
                    // area message
    				SemesterProject.storyOutputTF.appendText("\nArea 1\n");
    			} else {
    				// first time area message
    				SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 1\n");
    				beenTo1 = true;
                }
                break;
            case 2:              
                if (beenTo2) {
                    // area message
                    SemesterProject.storyOutputTF.appendText("\nArea 2\n");
                } else {
                    // first time area message
                    SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 2\n");
                    beenTo2 = true;
                }
                break;
            case 3:               
                if (beenTo3) {
                    // area message
                    SemesterProject.storyOutputTF.appendText("\nArea 3\n");
                } else {
                    // first time area message
                    SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 3\n");
                    beenTo3 = true;
                }
                break;
            case 4:
            	SemesterProject.mapIV.setImage(room4);
                if (beenTo4) {
                    // area message
                    SemesterProject.storyOutputTF.appendText("\nArea 4\n");
                } else {
                    // first time area message
                    SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 4\n");
                    beenTo4 = true;
                }
                break;
            case 5:
                if (beenTo5) {
                    // area message
                    SemesterProject.storyOutputTF.appendText("\nArea 5\n");
                } else {
                    // first time area message
                	SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 5\n");
                    beenTo5 = true;
                }
                break;
            case 6:                
                if (beenTo6) {
                    // area message
                    SemesterProject.storyOutputTF.appendText("\nArea 6\n");
                } else {
                    // first time area message
                    SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 6\n");
                    beenTo6 = true;
                }
                break;
            case 7:               
               	if (beenTo7) {
                    // area message
                    SemesterProject.storyOutputTF.appendText("\nArea 7\n");
                } else {
                    // first time area message
                    SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 7\n");
                    beenTo7 = true;
                }
                break;
            case 8:               
                if (beenTo8) {
                    // area message
                    SemesterProject.storyOutputTF.appendText("\nArea 8\n");
                } else {
                    // first time area message
                    SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 8\n");
                    beenTo8 = true;
                }
                break;
            case 9:                
                if (beenTo9) {
                    // area message
                    SemesterProject.storyOutputTF.appendText("\nArea 9\n");
                } else {
                    // first time area message
                    SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 9\n");
                    beenTo9 = true;
                }
                break;
            case 10:               
                if (beenTo10) {
                    // area message
                    SemesterProject.storyOutputTF.appendText("\nArea 10\n");
                } else {
                    // first time area message
                    SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 10\n");
                    beenTo10 = true;
                }
                break;
            case 11:
                if (beenTo11) {
                	// area message
                    SemesterProject.storyOutputTF.appendText("\nArea 11\n");
                } else {
                    // first time area message
                	SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 11\n");
                    beenTo11 = true;
                }
                break;
            case 12:
                if (beenTo12) {
                	// area message
                	SemesterProject.storyOutputTF.appendText("\nArea 12\n");
                } else {
                	// first time area message
                	SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 12\n");
                	beenTo12 = true;
                }
                break;
            case 13:
                if (beenTo13) {
                	// area message
                	SemesterProject.storyOutputTF.appendText("\nArea 13\n");
                } else {
                	// first time area message
                	SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 13\n");
                	beenTo13 = true;
                }
                break;
            case 14:
                if (beenTo14) {
                	// area message
                	SemesterProject.storyOutputTF.appendText("\nArea 14\n");
                } else {
                	// first time area message
                	SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 14\n");
                	beenTo14 = true;
                }
                break;
            case 15:
                if (beenTo15) {
                	// area message
                	SemesterProject.storyOutputTF.appendText("\nArea 15\n");
                } else {
                	// first time area message
                	SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 15\n");
                	beenTo15 = true;
                }
                break;
            case 16:
                if (beenTo16) {
                	// area message
                	SemesterProject.storyOutputTF.appendText("\nArea 16\n");
                } else {
                	// first time area message
                	SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 16\n");
                	beenTo16 = true;
                }
                break;
            case 17:
                if (beenTo17) {
                	// area message
                	SemesterProject.storyOutputTF.appendText("\nArea 17\n");
                } else {
                	// first time area message
                	SemesterProject.storyOutputTF.appendText("\nFirst Time to Area 17\n");
                	beenTo17 = true;
                }
                break;
            }
    }
}
