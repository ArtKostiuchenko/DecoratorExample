public class AirportTicketOffice {
    public static void main(String[] args) {
        ITickets tickets = new AirTicketImpl("Standard Ticket ",1000,10.0,0);

        Printer printer = new Printer(tickets);
        printer.toPrintInfo();

        tickets = new BaggageDecorator(tickets);

        printer = new Printer(tickets);
        printer.toPrintInfo();

        tickets = new RefundDecorator(tickets);

        printer = new Printer(tickets);
        printer.toPrintInfo();

    }
}


