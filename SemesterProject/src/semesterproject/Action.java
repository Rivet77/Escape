// -- Project Name --
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;



public class Action extends FantasyRace {
    
    // variables
    private static boolean playerDead;
    private static int characterHealth = getCharacterHealth();
    private static int characterAttack = getCharacterAttackPower();
    private static int characterSpeed = getCharacterSpeed();
    private static int enemyHealth = getEnemyHealth();
    private static int enemyAttack = getEnemyAttackPower();
    private static int enemySpeed = getEnemySpeed();
    
    
    // getters
    public static boolean getPlayerDead() {
        return playerDead;
    }
    
    
    // setters
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
    
    
    // methods
    public static void goWest() {
        if (Action.getPlayerDead() == false) {
            switch (Areas.getArea()) {
            case 1:
                break;
            default:
                // if no other case numbers activate
                SemesterProject.storyOutputTF.appendText("\nYou can't go West.\n");
        }
        }
    }
    
    
    public static void goEast() {
        if (Action.getPlayerDead() == false) {
        switch (Areas.getArea()) {
            case 1:
                break;
            default:
                // if no other case numbers activate
                SemesterProject.storyOutputTF.appendText("\nYou can't go East.\n");
        }
        }
    }
    
    
    public static void goNorth() {
        if (Action.getPlayerDead() == false) {
        switch (Areas.getArea()) {
            case 0:
            	// move north from start
            	// using area 0 to area 4 from small map as a placeholder
            	Areas.setLastArea(0);
            	Areas.setArea(4);
            	Areas.activateArea();
                break;
            case 1:
                break;
            default:
                // if no other case numbers activate
                SemesterProject.storyOutputTF.appendText("\nYou can't go North.\n");
        }
        }
    }
    
    
    public static void goSouth() {
        if (Action.getPlayerDead() == false) {
        switch (Areas.getArea()) {
            case 1:
                break;
            default:
                // if no other case numbers activate
                SemesterProject.storyOutputTF.appendText("\nYou can't go South.\n");                   
        }
        }
    }
    
    
    public static void attack() {        
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
    
    
    // try to run away from battle
    // determine percent chance of being able to run based on speed
    // if unsuccseful, initiate another round of attack()
    
    /*
    public static void run() {
        if (Action.getPlayerDead() == false) {    
            if () { ------------------------------------------------- // code to determine if an enemy is present
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
    */
    
    // allow player to retreat to the previous room they were in
    public static boolean gotAway(boolean run) {
         if (run = true) {
             Areas.setArea(Areas.getLastArea());             
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
            
    }
    
    
    public static void youWin() {
        // set end game message
        SemesterProject.storyOutputTF.appendText("\nYou completed the dungeon!\n");
    }
}
