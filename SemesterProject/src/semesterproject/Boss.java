// -- Project Name --
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/25/2019
package semesterproject;


public class Ogre extends FantasyRace {

    // variables
    int constituton = (Math.random()*((20-1)+1))+1) + 5;
    int strength = (Math.random()*((20-1)+1))+1) + 10;
    int dexterity = (Math.random()*((20-1)+1))+1) + 5;

    // create boss
    Boss() {
        super();
    }

    public void setGoblinStats() {
        setEnemyHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
