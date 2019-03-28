// Semester Project
// Riley Tucker
// 11-9-18
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
