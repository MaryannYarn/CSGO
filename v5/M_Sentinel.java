//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class M_Sentinel extends Monster {
    
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Sentinel()
    {
	_defense = 25;
	_attack = 0.8;
    }
    //returns a description of Sentinel
    public static String about(){
	return "The Sentinel has high defenses at a cost of its attacks.";
    }
}// end class Sentinel
