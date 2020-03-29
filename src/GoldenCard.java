public class GoldenCard extends Card{

    public static final double PAYMENT_PERCENT=0.15;

    public GoldenCard(String name) {
        super(name);
    }

    @Override
    public boolean executePayment(double cost) {
        if (cost>getAmount())
            return false;

        return withdraw(cost-cost*PAYMENT_PERCENT);
    }
}
