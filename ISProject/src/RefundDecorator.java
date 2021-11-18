public class RefundDecorator implements ITickets{

    ITickets component;

    public RefundDecorator(ITickets component){ this.component = component;}

    @Override
    public double getPrice() {
        return component.getPrice();
    }

    @Override
    public double getBaggageWeight() {
        return component.getBaggageWeight();
    }

    @Override
    public double getPercentageRefund() {
        return 70;
    }

    @Override
    public String getTicketName() {
        return component.getTicketName()+", With Additional Refund";
    }
}
