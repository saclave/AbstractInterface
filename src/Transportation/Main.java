package Transportation;

public class Main {
    public static void main(String[] args){
        int budget = 500;
        Transportation car = new Car();
        Transportation bus = new Bus();
        Transportation train = new Train();
        Transportation plane = new Plane();
        car.computeTransportation(budget);
        bus.computeTransportation(budget);
        train.computeTransportation(budget);
        plane.computeTransportation(budget);
    }
}
