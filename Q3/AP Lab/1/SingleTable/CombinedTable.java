public class CombinedTable{
    private int seats;
    private double desirability;
    private SingleTable s1;
    private SingleTable s2;

    public CombinedTable(SingleTable s1, SingleTable s2){
        this.s1 = s1;
        this.s2 = s2;
        seats = s1.getNumSeats() + s2.getNumSeats() - 2;
    }

    public boolean canSeat(int n){
        if(n <= seats){
            return true;
        }
        return false;
    }

    public double getDesirability(){
        desirability = (s1.getViewQuality() + s2.getViewQuality())/2;
        if(s1.getHeight() != s2.getHeight()){
            desirability -= 10;
        }
        return desirability;
    }
}