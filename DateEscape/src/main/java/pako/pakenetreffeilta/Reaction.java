package pako.pakenetreffeilta;

public enum Reaction {

    HAPPY, OVERJOYED, SAD, ANGRY,
    FURIOUS;
    
    public void tellItLikeItIs() {
        switch (this) {
            case HAPPY:
                System.out.println("Mondays are bad.");
                break;
                    
            case OVERJOYED:
                System.out.println("\\o/");
                break;
                         
            case ANGRY: case FURIOUS:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
}