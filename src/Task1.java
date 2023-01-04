import java.io.Console;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Console console = System.console();

        PassengerShip passengerShip = new PassengerShip("Cinderella", 2000, 8, 30);

        int passengers = Integer.parseInt(console.readLine("How many passengers? "));
        passengerShip.setPassengers(passengers);

        System.out.println(passengerShip);
    }
}
