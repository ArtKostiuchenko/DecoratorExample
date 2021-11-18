public class Printer {

    ITickets tickets;

    public Printer(ITickets varTickets) { this.tickets = varTickets;}

    void toPrintInfo(){
        System.out.println("________________________________");
        System.out.println("Ticket name: "+tickets.getTicketName());
        System.out.println("Ticket price: "+tickets.getPrice());
        System.out.println("Baggage weight: "+tickets.getBaggageWeight());
        System.out.println("Percentage refund: "+tickets.getPercentageRefund());
        System.out.println("________________________________");
    }
}
