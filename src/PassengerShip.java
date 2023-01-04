public class PassengerShip extends Ship {

    protected final int maxPassengers;
    private int passengers;
    protected final int passengerWeight = 150;
    protected final int crewWeight = 100;

    public PassengerShip(String name, int maxWeight, int crew, int maxPassengers) {
        super(name, maxWeight, crew, type);

        this.maxPassengers = maxPassengers;
    }

    public void setPassengers(int passengers) throws OverloadException {

        if (passengers < 0) {
            throw new OverloadException("Antal passagerare måste överstiga 0");
        }

        else if (passengers > maxPassengers) {
            throw new OverloadException("Antalet passagerare överstiger max antal passagerare!");
        }

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

        return "Name: " + getName() + ", " + "Current weight: " + getCurrentWeight() + ", " + "Passengers: "
                + getPassengers();
    }

}
