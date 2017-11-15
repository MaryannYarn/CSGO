//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class P_Mage extends Protagonist
{	  
	/*=============================================
	  default constructor
	  pre:  instance vars are declared
	  post: initializes instance vars.
	  =============================================*/
	public Mage()
	{
		super();
		_hitPts = 90; //base:125
		_strength = 120; //base:100
		_defense = 30;	//base:40
		_attack = .65; //base:.4	
	}
	
	/*=============================================
	  about(): returns a description of the Protagonist subclass
	  =============================================*/
	public static String about()
	{
		String str = "Amongst those gifted with the powers of nature, a group has risen with courage to challenge monsters. The MAGE class is blessed with higher strength and attack and excels at ranged attacks." ;
		return str;
	}
	
}//end class Warrior
