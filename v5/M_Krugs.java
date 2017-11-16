//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#33 -- Ye Olde Role Playing Game, Realized
//2017-11-15

public class M_Krugs extends Monster {
    
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public M_Krugs()
    {
	_hitPts = 200;
	_strength -= 10;
    }
    //returns a description of Krugs
    public String about(){
	return "The Krugs can tank more dmg but at cost of dealing less dmg";
    }

}//ends M_Krugs
