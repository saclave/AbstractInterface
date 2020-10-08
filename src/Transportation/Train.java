package Transportation;

public class Train extends Transportation {
    @Override
    public void computeTransportation(int budget) {
        int train;
        train = budget - 400;
        if(train >= 0){
            System.out.println("You can take a TRAIN");
        }
        else{
            System.out.println("Below the budget. You cannot take a TRAIN");
        }
    }
}
