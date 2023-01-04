import java.util.ArrayList;

public class CargoShip extends Ship {

    protected ArrayList<Cargo> cargos;
    private float totalWeight;

    public CargoShip(String name, int maxWeight, int crew) {
        super(name, maxWeight, crew, type);

        cargos = new ArrayList<Cargo>();
    }

    @Override
    public int getCurrentWeight() {

        for (Cargo cargo : cargos) {
            totalWeight += cargo.getWeight();
        }
        return (crew * 100) + ((int) totalWeight);
    }

    public void addCargo(Cargo cargo) {
        cargos.add(cargo);
    }

    public String toString() {

        return "Name: " + getName() + ", " + "Current weight: " + getCurrentWeight();
    }

}
