    
// -- Project Name --
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/25/2019
package semesterproject;


public class Ogre extends FantasyRace {
    
    // variables
    int constituton = (int) ((Math.random()*((20-1)+1))+1) + 4;
    // this is my swamp now, donkey
    int strength = (int) ((Math.random()*((20-1)+1))+1) + 5;
    int dexterity = (int) ((Math.random()*((20-1)+1))+1) + 1;
    
    // create an ogre
    Ogre() {
        super();
    }
    
    public void setOgreStats() {
        setEnemyHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
