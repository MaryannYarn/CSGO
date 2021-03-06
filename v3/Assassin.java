//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Assassin extends Protagonist
{	  
	/*=============================================
	  default constructor
	  pre:  instance vars are declared
	  post: initializes instance vars.
	  =============================================*/
	public Assassin()
	{
		super();
		_hitPts = 135; //base:125
		_strength = 140; //base:100
		_defense = 35;	//base:40
		_attack = .5; //base:.4
	}
	
	/*=============================================
	  about(): returns a description of the Protagonist subclass
	  =============================================*/
	public static String about()
	{
		String str = "Denizens of nightfall, the ASSASSIN class harbors increased strength and attack stats, excelling at stealth attacks and close-range combat.";
		return str;
	}
	
}//end class Warrior