// IvyTech Dungeon Game
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;


public class Orc extends FantasyRace {
    
    // variables
    int constituton = (int) ((Math.random()*((20-1)+1))+1) + 3;
    int strength = (int) ((Math.random()*((20-1)+1))+1) + 4;
    int dexterity = (int) ((Math.random()*((20-1)+1))+1) + 2;
    
    // create a orc
    Orc() {
        super();
    }
    
    public void setOrcStats() {
        setEnemyHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
