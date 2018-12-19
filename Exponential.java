/**
 * This class calculates the exponential of a number
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (19th of December 2018)
 */
public class Exponential
{
    /**
     * Constructor for objects of class Exponential
     */
    public Exponential()
    {
    }

    /**
     * Method that calculates the exponential of a number
     * @param a The number exponential is to be calculated upon
     * @param n The exponential value
     */
    public long exp(long a, long n) 
    {
        if(n > 0) {
            return a * exp(a, n-1);
        }
        else {
            return 1;
        }
    }
}
