public class BaggageDecorator implements ITickets{

    ITickets component;

    public BaggageDecorator(ITickets component){
        this.component = component;
    }


    @Override
    public double getPrice() {
        return 3.0*component.getPrice();
    }

    @Override
    public double getBaggageWeight() {
        return 2.0*component.getBaggageWeight();
    }

    @Override
    public double getPercentageRefund() {
        return component.getPercentageRefund();
    }

    @Override
    public String getTicketName() {
        return component.getTicketName()+", With Additional Baggage";

    }

}
