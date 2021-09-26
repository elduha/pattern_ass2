package pattern_ass2;

public class Mobile implements Observer{
    @Override
    public void update(Stock stock) {
        System.out.println("Mobile Price " + stock.getStockName() + " has some changes " + stock.getPrice());
    }
}
