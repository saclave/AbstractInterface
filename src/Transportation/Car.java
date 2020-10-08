package Transportation;

public class Car extends Transportation {
    @Override
    public void computeTransportation(int budget){
        int car;
        car = budget - 500;
        if(car >= 0){
            System.out.println("You can drive a CAR");
        }
        else{
            System.out.println("Below the budget. You cannot take a CAR");
        }
    }
}
