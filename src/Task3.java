
public class Task3 {
    public static void main(String[] args) throws OverloadException {

        // KONTROLLUTSKRIFT FÖR ATT SE SÅ ATT SETPASSENGERS FUNGERAR SOM TÄNKT

        // PassengerShip pass = new PassengerShip("Cindrella", 3000, 3, 3);

        // try {
        // pass.setPassengers(5);
        // } catch (OverloadException e) {
        // System.err.println(e.getMessage());
        // }

        // FICK INTE RIKTIGT TILL DET MEN DETTA ÄR ETT FÖRSÖK I ALLA FALL

        CargoShip ship = new CargoShip("Black Pearl", 2000, 2);

        Cargo cargo = new Cargo("cargo1", 300);

        ship.addCargo(cargo);

        System.out.println(ship);

        ship.cargos.clear();

        Cargo cargo2 = new Cargo("cargo2", 1505);

        try {
            ship.addCargo(cargo2);
        } catch (OverloadException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(ship);

    }
}
