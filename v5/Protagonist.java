//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#33 -- Ye Olde Role Playing Game, Realized
//2017-11-15

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
    public int getHP() { return _hitPts; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
     /*=============================================
      void heal() -- heals the Protagonist. 
      pre:  None.
      post: Calculates hitpoints to be healed, from 10 to 20. 
      =============================================*/
    public void heal()
    {
	_hitPts += (int)(Math.random() * 10 + 10);
    }

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



    //revert to normal mode
    public abstract void normalize();


    
    //calls a String description of a Protagonist subclass

    public abstract String about();

}//end class Protagonist
