// -- Project Name --
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;


public class Dwarf extends FantasyRace {
    
    // variables
    int constituton = (int)((Math.random()*((20-1)+1))+1) + 4;
    int strength = (int)((Math.random()*((20-1)+1))+1) + 3;
    int dexterity = (int)((Math.random()*((20-1)+1))+1) + 2;
    
    // create a dwarf
    Dwarf() {
        super();
    }
    
    public void setDwarfStats() {
        setCharacterHealth(constituton * 10);
        setCharacterAttackPower(strength);
        setCharacterSpeed(dexterity);
    } 
}
