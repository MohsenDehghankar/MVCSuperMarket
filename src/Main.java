public class Main {
    public static void main(String[] args) {
        SuperMarketController controller = new SuperMarketController();
        controller.setSuperMarket(new SuperMarket());
        controller.setSuperMarketView(new SuperMarketView());
        controller.start();
    }
}
