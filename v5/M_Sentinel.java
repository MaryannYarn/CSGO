//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#33 -- Ye Olde Role Playing Game, Realized
//2017-11-15

public class M_Sentinel extends Monster {
    
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public M_Sentinel()
    {
	_defense = 25;
	_attack = 0.8;
    }
    //returns a description of Sentinel
    public String about(){
	return "The Sentinel has high defenses at a cost of its attacks.";
    }
}// end class M_Sentinel
