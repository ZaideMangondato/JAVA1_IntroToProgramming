/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Ayco
 */


/*
    This class writes out Prime numbers. A number is prime if it is 
    divisible by 1 and the number itself and no other number.
*/

public class JPrimeNumber
{

  public static String isPrime ( int num )
  {
    boolean prime = true;
    if(prime)
        return "Open";
    else
        return "Closed";
  }



  public static void main ( String[] args )
  {
    // This loop writes out all the prime numbers less than 1000.
    for ( int i = 2; i <= 1000; i++ )
    {
      if ( isPrime)
	System.out.println ( i );
    }
  }
}
X
