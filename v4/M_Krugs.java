//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Krugs extends Monster {
    
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Krugs()
    {
	_hitPts = 200;
	_strength -= 10;
    }
    //returns a description of Krugs
    public static String about(){
	return "The Krugs can tank more dmg but at cost of dealing less dmg";
    }

}//ends Krugs
