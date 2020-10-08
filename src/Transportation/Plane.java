package Transportation;

public class Plane extends Transportation {

    @Override
    public void computeTransportation(int budget) {
        int plane;
        plane = budget - 1000;
        if(plane >= 0){
            System.out.println("You can take a PLANE");
        }
        else{
            System.out.println("Below the budget. You cannot take a PLANE");
        }
    }
}
