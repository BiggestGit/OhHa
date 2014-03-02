package pako.pakenetreffeilta;

import java.util.Random;

public class Speak {

    private int scaleOfReaction;
    private boolean randomReactionScaleOn;
    private String name;
    private boolean isNegative;
    
        
    public Speak(int scaleOfReaction, boolean randomReactionRangeOn, String name, boolean isNegative){
        
        
        this.randomReactionScaleOn = randomReactionRangeOn;
        this.name = name;
        this.isNegative = isNegative;
        if (randomReactionRangeOn && scaleOfReaction < 10) {
            this.scaleOfReaction = 10;
        }
        else{
            this.scaleOfReaction = scaleOfReaction;
        }
    }
    
    public void executeSpeaking(Girl girl){
        int reaction = this.scaleOfReaction;
        Random rand = new Random();
        if (randomReactionScaleOn) {
            reaction = 5 + rand.nextInt(scaleOfReaction - 4);
        }
        if (isNegative) {
            girl.decreaseInterestRegularConsequence(reaction);
        }
        else{
            girl.increaseInterestRegularConsequence(reaction);
        }
    }
}
