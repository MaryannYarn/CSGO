//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#28 -- Ye Olde Role Playing Game
//2017-11-08

public class Protagonist {
    
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String name;
    private int HP;
    private int strength;
    private int defense;
    private double attkRating;

    // ~~~~~~~~~~ CONSTRUCTOR ~~~~~~~~~~~
    public Protagonist(String newName) { //assigns attribute with default values
	name = newName;                  //and a given name
	HP = 125;
	strength = 100;
	defense = 40;
	attkRating = 0.4;
    }

    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
    public boolean isAlive(){ //returns boolean indicating living or dead
	return HP > 0;
    }

    public int getDefense(){ //returns value of defense attribute
	return defense;
    }

    public String getName(){ //returns value of name attribute
	return name;
    }

    public void lowerHP(int dmg){ //takes an int parameter, decreases HP by int
	HP -= dmg;
    }

    public int attack(Monster x){ //attacks, returns damage inflicted on Monster
	int damage = ((int)(strength * attkRating)) - x.getDefense();
	x.lowerHP(damage);
	return damage;
    }

    public void specialize(){ //prepare to perform special attack
	defense -= 5;
	attkRating += 0.2;
    }

    public void normalize(){ //prepare to perform normal attack
	defense = 40;
	attkRating = 0.4;
    }
}// end class Protagonist
	
	
