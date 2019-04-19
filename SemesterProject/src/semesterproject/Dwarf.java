// -- Project Name --
// Riley Tucker, Aiden Hutton
// Karen Stackhouse, Christopher Fields
// Created On 4/18/2019
package semesterproject;


public class Dwarf extends FantasyRace {
    
    // variables
    int constituton = 4;
    int strength = 3;
    int dexterity = 2;
    
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
