package track.travelScenario;

public class Conductor {

    void collectMoney(Money money) {
        System.out.println("Money collected from passenger");
    }

    Ticket giveTicket() {
        System.out.println("Ticket given to passenger");
        Ticket ticket = new Ticket();
        return ticket;
    }
}
