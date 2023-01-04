public class PassengerShip extends Ship {

    protected final int maxPassengers;
    private int passengers;
    private final int passengerWeight = 150;
    private final int crewWeight = 100;

    public PassengerShip(String name, int maxWeight, int crew, int maxPassengers) {
        super(name, maxWeight, crew, type);

        this.maxPassengers = maxPassengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public int getCurrentWeight() {
        int crews = getCrew() * crewWeight;
        int pass = getPassengers() * passengerWeight;

        return crews + pass;
    }

    public String toString() {

        return "Name: " + name + ", " + "Current weight: " + getCurrentWeight() + ", " + "Passengers: " + passengers;
    }

}
