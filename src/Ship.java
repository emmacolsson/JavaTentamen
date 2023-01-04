public abstract class Ship {

    protected final String name;
    private final int maxWeight;
    private final int crew;
    protected static Shiptype type;

    public Ship(String name, int maxWeight, int crew, Shiptype type) {
        this.name = name;
        this.maxWeight = maxWeight;
        this.crew = crew;
        Ship.type = type;

    }

    public abstract int getCurrentWeight();

    public String getName() {
        return name;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getCrew() {
        return crew;
    }

    public Shiptype getType() {
        return type;
    }

    public String toString() {
        return "Name: " + getName() + ", " + "Max weight: " + getMaxWeight() + ", " + "Crew: " + getCrew() + ", "
                + "Ship type: "
                + getType();
    }

}
