
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class die20
{
    /**
     * Contains the current value of the die
     */
    private int value;

    /**
     * Constructor to do an initial roll to set the first value
     */
    public die20() {

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
        this.value = (int)(Math.random() * 20) + 1;
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
