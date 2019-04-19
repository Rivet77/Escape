// -- Project Name --
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;


public class Human extends FantasyRace {
    
    // variables
    int constituton = 3;
    int strength = 3;
    int dexterity = 3;
    
    // create a human
    Human() {
        super();
    }
    
    public void setHumanStats() {
        setCharacterHealth(constituton * 10);        
        setCharacterAttackPower(strength);
        setCharacterSpeed(dexterity);
    }    
}
