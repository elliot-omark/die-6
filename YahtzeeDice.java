public class YahtzeeDice
{
    String valueofdice;
    private int dicetoroll=1; int dievalue[]={5};
    private Die6 die1;private int roll1;
    private Die6 die2;private int roll2;
    private Die6 die3;private int roll3;
    private Die6 die4;private int roll4;
    private Die6 die5;private int roll5;
    /**
     * Constructor to do an initial roll to set the first value
     */
    public YahtzeeDice(){
        die1=new Die6();die2=new Die6();die3=new Die6();
        die4=new Die6();die5=new Die6();
    }

    public String getValue2(){
        valueofdice="your rolled "+die1.getValue()+"+"+die2.getValue()+"+"+
        die3.getValue()+"+"+die4.getValue()+"+"+die5.getValue();
        return valueofdice;
    }

    public int[] check(){
        return this.dievalue;
    }

    public void roll() {
        die1.roll();die2.roll();die3.roll();die4.roll();die5.roll();
    }

    public void rollagain(int dienumber){
        dienumber=roll1+roll2+roll3+roll4+roll5;
        dienumber=dicetoroll;
        while(dicetoroll<0){
            if(roll1==1){die1.roll();}
            if(roll2==1){die2.roll();}
            if(roll3==1){die3.roll();}
            if(roll4==1){die4.roll();}
            if(roll5==1){die5.roll();}
        }
    }

    public String rollAndGetValue2() {
        roll();
        return getValue2();
    }
}

