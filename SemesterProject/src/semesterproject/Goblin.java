// Semester Project
// Riley Tucker
// 11-9-18
package semesterproject;


public class Goblin extends FantasyRace {
    
    // variables
    int constituton = 2;
    int strength = 2;
    int dexterity = 5;
    
    // create a goblin
    Goblin() {
        super();
    }
    
    public void setGoblinStats() {
        setEnemyHealth(constituton * 10);
        setEnemyAttackPower(strength);
        setEnemySpeed(dexterity);
    } 
}
