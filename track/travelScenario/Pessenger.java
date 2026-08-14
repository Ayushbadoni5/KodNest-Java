package track.travelScenario;

public class Pessenger {
    public static void main(String[] args) {

        Conductor conductor = new Conductor();
        Money money = new Money();
        conductor.collectMoney(money);
        Ticket ticket = conductor.giveTicket();
        System.out.println(ticket);
        if (ticket != null) {
            System.out.println("Ticket received from conductor");
        }
    }
}
