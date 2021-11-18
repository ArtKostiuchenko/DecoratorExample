public class AirTicketImpl implements ITickets {
    private String TicketName;
    private double TicketPrice;
    private double BaggageWeight;
    private int TicketRefund;


    public AirTicketImpl(String varTicketName, double varTicketPrice, double varBaggageWeight, int varRefund){
        this.TicketName = varTicketName;
        this.TicketPrice = varTicketPrice;
        this.BaggageWeight = varBaggageWeight;
        this.TicketRefund = varRefund;
    }


    @Override
    public double getPrice() {
        return this.TicketPrice;
    }

    @Override
    public double getBaggageWeight() {
        return this.BaggageWeight;
    }

    @Override
    public double getPercentageRefund() {
        return this.TicketRefund;
    }

    @Override
    public String getTicketName() {
        return this.TicketName;
    }


}
