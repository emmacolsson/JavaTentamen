
public class Task2 {
    public static void main(String[] args) throws Exception {

        // Console console = System.console();

        CargoShip cargoShip = new CargoShip("DHL", 10000, 4);

        Cargo cargo1 = new Cargo("Food", 500);
        Cargo cargo2 = new Cargo("Veichles", 2000);
        Cargo cargo3 = new Cargo("Fuel", 300);

        cargoShip.addCargo(cargo1);
        cargoShip.addCargo(cargo2);
        cargoShip.addCargo(cargo3);

        System.out.println(cargoShip);

        cargoShip.cargos.clear();

        Cargo cargo4 = new Cargo("Animals", 250);
        Cargo cargo5 = new Cargo("Clothes", 350);

        cargoShip.addCargo(cargo4);
        cargoShip.addCargo(cargo5);

        System.out.println(cargoShip);

    }
}
