//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14

public abstract class Protagonist extends Character
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Protagonist()
    {
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = .4;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Protagonist( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      int attack(Monster) -- simulates attack on instance of class Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
      Calls opponent's lowerHP() method to inflict damage. 
      Returns damage dealt.
      =============================================*/
    public int attack( Monster opponent )
    {

	int damage = (int)( (_strength * _attack) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack


    //prepare a Protagonist for a special attack
    public abstract void specialize();

    /* public void specialize()
    {
	_attack = .75;
	_defense = 20;
	}*/


    //revert to normal mode
    public abstract void normalize();

    /*public void normalize()
    {
	_attack = .4;
	_defense = 40;
	}*/

    //returns a String description of Protagonist
    public abstract String about();

}//end class Protagonist
