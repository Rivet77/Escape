// -- Project Name --
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;


public abstract class FantasyRace {
    
    // variables
    private static int characterHealth;
    private static int characterAttackPower;
    private static int characterSpeed;
    
    private static int enemyHealth;
    private static int enemyAttackPower;
    private static int enemySpeed;
    
    
    // getters
    public static int getCharacterHealth() {
        return characterHealth;
    }
    public static int getCharacterAttackPower() {
        return characterAttackPower;
    }
    public static int getCharacterSpeed() {
        return characterSpeed;
    }
    
    public static int getEnemyHealth() {
        return enemyHealth;
    }
    public static int getEnemyAttackPower() {
        return enemyAttackPower;
    }
    public static int getEnemySpeed() {
        return enemySpeed;
    }
    
    
    // setters
    public static void setCharacterHealth(int newCharacterHealth) {
        characterHealth = newCharacterHealth;
    }
    public void setCharacterAttackPower(int newCharacterAttackPower) {
        characterAttackPower = newCharacterAttackPower;
    }
    public void setCharacterSpeed(int newCharacterSpeed) {
        characterSpeed = newCharacterSpeed;
    }
    
    public static void setEnemyHealth(int newEnemyHealth) {
        enemyHealth = newEnemyHealth;
    }
    public void setEnemyAttackPower(int newEnemyAttackPower) {
        enemyAttackPower = newEnemyAttackPower;
    }
    public void setEnemySpeed(int newEnemySpeed) {
        enemySpeed = newEnemySpeed;
    }
    
        
    // constructor with arguments
    FantasyRace(){
        characterHealth = getCharacterHealth() ;
        characterAttackPower = getCharacterAttackPower();
        characterSpeed = getCharacterSpeed();
    }
}
