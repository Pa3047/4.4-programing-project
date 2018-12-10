/**
 * @(#)BoxCars.java
 *
 *
 * @author 
 * @version 1.00 2018/12/7
 */


public class BoxCars {

    public static void main(String [] args)
    {
    	PairOfDice pair = new PairOfDice(6);
    	
    	int BC=pair.PairRoll();
    	System.out.println("Out of 1000 rolls, "+BC+" box cars were rolled");
    }
    
    
}