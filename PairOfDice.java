/**
 * @(#)PairOfDice.java
 *
 *
 * @author 
 * @version 1.00 2018/12/7
 */


public class PairOfDice {

	int sidenum, boxCar;

    public PairOfDice(int sides) 
    {
    	sidenum=sides;
    }
    
    public int PairRoll ()
    {
    	for (int count=0; count<1000; count++)
    	{
	    	int die1= (int) (Math.random()*sidenum+1);
	    	int die2= (int) (Math.random()*sidenum+1);
	    	if (die1==6 && die2==6)
	    	{
	    		boxCar++;	
	    	}
    	}
    	return boxCar;
    	
    }
    
    
}