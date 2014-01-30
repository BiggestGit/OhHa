package pako.pakenetreffeilta;

public class Girl extends GameObject {
    
    private Interest personalinterest;

    public Girl(Interest personalinterest, String name) {
        super(name, true);
        this.personalinterest = personalinterest;
        
    }
    
    public Girl(String name) {
        super(name, true);
        this.personalinterest = new Interest(100, 200);        
    }
    
    public void decreaseInterestWithConsequence(int amountdecreased){
       this.personalinterest.decreaseInterest(amountdecreased);
       this.personalinterest.checkForLowInterest();
    }
    public void decreaseInterestSansConsequence(int amountdecreased){
       this.personalinterest.decreaseInterest(amountdecreased);
    }
    
    public void increaseInterestWithConsequence(int amountincreased){
       this.personalinterest.increaseInterest(amountincreased);
       this.personalinterest.checkForHighInterest();
    }
    public void increaseInterestSansConsequence(int amountincreased){
       this.personalinterest.increaseInterest(amountincreased);
    }
    
    public int getGirlsInterestAmount(){
        return this.personalinterest.getInterestAmount();
    }
    
}
