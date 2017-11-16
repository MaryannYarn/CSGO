//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14

public class P_Warrior extends Protagonist
{	  
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Warrior()
    {
	super();
	_hitPts = 170; //base:125
	_strength = 130; //base:100
	_defense = 55;	//base:40
	_attack = .4; //base:.4
    }

    //prepare a Warrior for a special attack
    public void specialize()
    {
	_attack = .75;
	_defense = 35;
    }


    //revert to normal mode
    public void normalize()
    {
	_attack = .4;
	_defense = 55;
    }
    
    /*=============================================
      about(): returns a description of the Warrior class
      =============================================*/
    public static String about()
    {
	String str = "A gathering of only the bravest of all fighters, the WARRIOR class harbors increased HP, strength, and defense stats and excels at close-range combat. ";
	return str;
    }
	
}//end class P_Warrior

