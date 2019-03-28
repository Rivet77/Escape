// Semester Project
// Riley Tucker
// 11-9-18
package semesterproject;


public class TestClass {
    
    public static void main(String[] args) {
        
        // test stats work
        testFantacyRaces();
        testActions();
        
        
               
    }
    
    
    public static void testFantacyRaces() {
        
        System.out.println("--------------------FantasyRaceTest--------------------\n");
        // test human stats
        Human human = new Human();
        human.setHumanStats();
        System.out.println("Human's health, attack, speed");
        System.out.print("\t");
        System.out.print(human.getCharacterHealth() + "\t");
        System.out.print(human.getCharacterAttackPower() + "\t");
        System.out.print(human.getCharacterSpeed() + "\n");
        
        //test dwarf stats
        Dwarf dwarf = new Dwarf();
        dwarf.setDwarfStats();
        System.out.println("Dwarf's health, attack, speed");
        System.out.print("\t");
        System.out.print(dwarf.getCharacterHealth() + "\t");
        System.out.print(dwarf.getCharacterAttackPower() + "\t");
        System.out.print(dwarf.getCharacterSpeed() + "\n");
        
        // test elf stats
        Elf elf = new Elf();
        elf.setElfStats();
        System.out.println("Elf's health, attack, speed");
        System.out.print("\t");
        System.out.print(elf.getCharacterHealth() + "\t");
        System.out.print(elf.getCharacterAttackPower() + "\t");
        System.out.print(elf.getCharacterSpeed() + "\n");
        
        // test goblin stats
        Goblin goblin = new Goblin();
        goblin.setGoblinStats();
        System.out.println("Goblin's health, attack, speed");
        System.out.print("\t");
        System.out.print(goblin.getEnemyHealth() + "\t");
        System.out.print(goblin.getEnemyAttackPower() + "\t");
        System.out.print(goblin.getEnemySpeed() + "\n");
        
        // test orc stats
        Orc orc = new Orc();
        orc.setOrcStats();
        System.out.println("Orc's health, attack, speed");
        System.out.print("\t");
        System.out.print(orc.getEnemyHealth() + "\t");
        System.out.print(orc.getEnemyAttackPower() + "\t");
        System.out.print(orc.getEnemySpeed() + "\n");
    }
    
    
    public static void testActions() {
        
        System.out.println("--------------------ActionsTest--------------------\n");
        // Test attack action
        Human human = new Human();
        human.setHumanStats();
        System.out.println("Human's health, attack, speed");
        System.out.print("\t");
        System.out.print(human.getCharacterHealth() + "\t");
        System.out.print(human.getCharacterAttackPower() + "\t");
        System.out.print(human.getCharacterSpeed() + "\n");
        
        Goblin goblin = new Goblin();
        goblin.setGoblinStats();
        System.out.println("Goblin's health, attack, speed");
        System.out.print("\t");
        System.out.print(goblin.getEnemyHealth() + "\t");
        System.out.print(goblin.getEnemyAttackPower() + "\t");
        System.out.print(goblin.getEnemySpeed() + "\n");
        
        // test attack
        Action.attack();
        System.out.println("Human Health After Attack: " + Action.getCharacterHealth());
        System.out.println("Goblin Health After Attack: " + Action.getEnemyHealth() + "\n");
        
        // test run
        Action.run();
        System.out.println("character health: " + Action.getCharacterHealth());
        System.out.println("enemy health: " + Action.getEnemyHealth());
    }
    
}
