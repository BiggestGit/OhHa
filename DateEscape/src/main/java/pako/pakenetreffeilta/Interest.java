
package pako.pakenetreffeilta;

public class Interest {
    private int totalinterest;
    private int maximuminterest;

    public Interest(int interestamount, int maximuminterest) {
        this.totalinterest = interestamount;
        this.maximuminterest = maximuminterest;
    }
    
    public void increaseInterest(int amountincreased){
        if (this.totalinterest + amountincreased <= maximuminterest) {
            this.totalinterest += amountincreased;
        }
        else{
            this.totalinterest = maximuminterest;
        }
    }
    
    public void decreaseInterest(int amountdecreased){
        if (this.totalinterest - amountdecreased >= 0) {
            this.totalinterest -= amountdecreased;
        }
        else{
            this.totalinterest = 0;
        }
    }
    
    public boolean checkForLowInterest(){
        if (this.maximuminterest == 0) {
            return true;
        }
        return false;
    }
    public boolean checkForHighInterest(){
        if (this.maximuminterest == this.totalinterest) {
            return true;
        }
        return false;
    }
    
    public int getInterestAmount(){
        return this.totalinterest;
    }
    
    
}
