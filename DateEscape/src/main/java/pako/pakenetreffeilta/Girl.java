package pako.pakenetreffeilta;

import java.util.ArrayList;
import java.util.HashMap;

public class Girl extends GameObject {

    private Interest personalinterest;
    private Reaction reaction;
    private boolean negativeoutcome;
    private boolean positiveoutcome;

    public Girl(Interest personalinterest, String name) {
        super(name, true);
        this.personalinterest = personalinterest;
        this.negativeoutcome = false;
        this.positiveoutcome = false;
    }

    public Girl(String name) {
        super(name, true);
        this.personalinterest = new Interest(100, 200);
        this.negativeoutcome = false;
        this.positiveoutcome = false;
    }

    public void depositReaction() {
    }

    public void decreaseInterestRegularConsequence(int amountdecreased) {
        if (amountdecreased >= 40) {
            this.reaction = Reaction.FURIOUS;
            reaction.tellItLikeItIs();
        }

        if (amountdecreased >= 20 && amountdecreased < 40) {
            this.reaction = Reaction.SAD;
            reaction.tellItLikeItIs();
        }
        this.personalinterest.decreaseInterest(amountdecreased);
        this.negativeoutcome = this.personalinterest.checkForLowInterest();
    }

    public void decreaseInterestSpecialConsequence(int amountdecreased, Reaction reaction) {
        reaction.tellItLikeItIs();
        this.personalinterest.decreaseInterest(amountdecreased);
        this.negativeoutcome = this.personalinterest.checkForLowInterest();
    }

    public void increaseInterestRegularConsequence(int amountincreased) {
        if (amountincreased >= 40) {
            this.reaction = Reaction.OVERJOYED;
            reaction.tellItLikeItIs();
        }

        if (amountincreased >= 20 && amountincreased < 40) {
            this.reaction = Reaction.HAPPY;
            reaction.tellItLikeItIs();
        }

        this.personalinterest.increaseInterest(amountincreased);
        this.positiveoutcome = this.personalinterest.checkForHighInterest();
    }

    public void increaseInterestSpecialConsequence(int amountincreased, Reaction reaction) {
        reaction.tellItLikeItIs();
        this.personalinterest.increaseInterest(amountincreased);
        this.positiveoutcome = this.personalinterest.checkForHighInterest();
    }

    public int getGirlsInterestAmount() {
        return this.personalinterest.getInterestAmount();
    }
}
