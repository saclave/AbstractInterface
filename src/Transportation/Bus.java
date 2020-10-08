package Transportation;

public class Bus extends Transportation {
    @Override
    public void computeTransportation(int budget) {
        int bus;
        bus = budget - 300;
        if(bus >= 0){
            System.out.println("You can take a BUS");
        }
        else{
            System.out.println("Below the budget. You cannot take a BUS");
        }
    }
}
