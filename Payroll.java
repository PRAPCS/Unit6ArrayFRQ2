public class Payroll
{
private int[] itemsSold; // number of items sold by each employee
private double[] wages; // wages to be computed in part (b)
/** Returns the bonus threshold as described in part (a).
*/
//Constructor that creates a PayRoll object
public Payroll(){
//Create the itemsSold array that is a random size from 3-10 employees
  itemsSold = new int[(int)(Math.random()*8+3)];
  //Fill the array with random values from 1-100
  for(int i=0; i<itemsSold.length; i++){
    itemsSold[i] = (int)(Math.random()*100+1);
  }
}
//Write a method getItemsSold() that returns the contents of the array
public void getItemsSold(){
  for(int x: itemsSold){
    System.out.print(x+" ");
  }
}
public double computeBonusThreshold()
{
/* To be implemented in part (a) */
return 0.0;
}
/** Computes employee wages as described in part (b)
* and stores them in wages.
* The parameter fixedWage represents the fixed amount each employee
* is paid per day.
* The parameter perItemWage represents the amount each employee
* is paid per item sold.
*/
public void computeWages(double fixedWage, double perItemWage)
{
/* To be implemented in part (b) */
}

//Write the method getWages()

}