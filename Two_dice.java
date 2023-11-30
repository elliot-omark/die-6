
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class Two_dice
{
    /**
     * Contains the current value of the die
     */
    private Die_n die1;
    private Die_n die2;
    private int value;
    /**
     * Constructor to do an initial roll to set the first value
     */
    public Two_dice(int sides){
        this.die1= new
        this.die2= new
        this.roll();
    }

    /**
     * Getter for value
     * @return Die value
     */
    public int getValue() {
        return value;
    }

    /**
     * Roll the die! Generate random number 1 <= x <= 6 and assign to value
     * Note that roll does NOT return the new value
     */
    public void roll() {
        this.die1;
        this.die2;
        die1+die2=this.value;
    }

    /**
     * Roll the die and return the new value
     * @return Die value
     */
    public int rollAndGetValue() {
        roll();
        return getValue();
    }

}

