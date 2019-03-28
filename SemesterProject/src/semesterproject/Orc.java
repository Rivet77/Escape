// Semester Project
// Riley Tucker
// 11-9-18
package semesterproject;


public class Orc extends FantasyRace {
    
    // variables
    int constituton = 3;
    int strength = 4;
    int dexterity = 2;
    
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
