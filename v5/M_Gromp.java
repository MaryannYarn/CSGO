//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class M_Gromp extends Monster {
    
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Gromp()
    {
	_defense = 15;
	_attack = 1.5;
    }
    //returns a description of Gromp
    public static String about(){
	return "The Gromp deals a lot of dmg but takes a lot in return.";
    }

}//ends Gromp
