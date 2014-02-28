package pako.pakenetreffeilta;

import java.util.ArrayList;
import java.util.HashMap;

public class Girl extends GameObject {
    
    private Interest personalinterest;
    private Reaction reaction;

    public Girl(Interest personalinterest, String name) {
        super(name, true);
        this.personalinterest = personalinterest;
        this.reaction = Reaction.OVERJOYED;
    }
    
    public Girl(String name) {
        super(name, true);
        this.personalinterest = new Interest(100, 200);
        this.reaction = Reaction.OVERJOYED;
    }
    
    public void depositReaction(){
        
    }
    
    public void decreaseInterestWithConsequence(int amountdecreased){
       this.personalinterest.decreaseInterest(amountdecreased);
       this.personalinterest.checkForLowInterest();
    }
    public void decreaseInterestSansConsequence(int amountdecreased){
       this.personalinterest.decreaseInterest(amountdecreased);
    }
    
    public void increaseInterestWithConsequence(int amountincreased){
        if (amountincreased >= 40) {
            this.reaction = Reaction.OVERJOYED;
            reaction.tellItLikeItIs();
        }
        
        if (amountincreased > 20 && amountincreased < 40) {
            this.reaction = Reaction.HAPPY;
            reaction.tellItLikeItIs();
        }
        
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
