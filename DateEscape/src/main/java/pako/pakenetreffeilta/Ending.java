package pako.pakenetreffeilta;

public enum Ending {

    POSITIVEENDING, NEGATIVEENDING;

    public void showEnding() {
        switch (this) {
            case POSITIVEENDING:
                System.out.println("Your irresistable and gentelmanly ways "
                        + "have irredeemably made her fall for you. Despite "
                        + "all your attempts at escape, she drags you away to "
                        + "her love lair, where unspeakable horrors await! May "
                        + "god have mercy on your soul!");
                break;

            case NEGATIVEENDING:
                System.out.println("Now you have done it! Your nonchalance "
                        + "and barbaric manner have made her loose her cool!"
                        + "An hour after the date her beefed up brother and "
                        + "his brawny friends pay you a visit. What's to "
                        + "follow is a long and hard -and slightly painful- "
                        + "lesson in perspective on why you should treat a "
                        + "lady with the candor and respect that all people "
                        + "deserve.");
                break;
        }
    }


}
