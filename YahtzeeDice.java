
public class YahtzeeDice
{
    /**
     * Contains the current value of the die
     */
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;

    /**
     * Constructor to do an initial roll to set the first value
     */
    public YahtzeeDice(){
        die1=new Die6();
        die2=new Die6();
        die3=new Die6();
        die4=new Die6();
        die5=new Die6();
    }
    public String getValue2(){
        return die1.getValue()+ " + "+ die2.getValue()+ " + "+
        die3.getValue()+ " + "+die4.getValue()+ " + "+die5.getValue();
    }
    
    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    public String rollAndGetValue2() {
        roll();
        return getValue2();
    }
}

