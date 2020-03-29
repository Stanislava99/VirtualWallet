public class StandardCard extends Card {

    public StandardCard (String name)
    {
        super(name);
    }

    @Override
    public boolean executePayment(double cost) {
        return withdraw(cost);
    }
}
