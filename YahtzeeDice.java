public class YahtzeeDice
{
    /**
     * Contains the current value of the die
     */
    private int dicetoroll=1;
    private Die6 die1;private int reroll1;
    private Die6 die2;private int reroll2;
    private Die6 die3;private int reroll3;
    private Die6 die4;private int reroll4;
    private Die6 die5;private int reroll5;
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
        return "you rolled "+die1.getValue()+" + "+die2.getValue()+" + "+
        die3.getValue()+" + "+die4.getValue()+" + "+die5.getValue();
    }

    public int check(){
        return die1.getValue();
    }

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }

    public void roll(int dieNumber)

    public String rollAndGetValue2() {
        roll();
        return getValue2();
    }
}

