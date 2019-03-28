// Semester Project
// Riley Tucker
// 11-9-18
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
