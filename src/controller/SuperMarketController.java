public class SuperMarketController {
    private SuperMarket superMarket;
    private SuperMarketView superMarketView;

    public void start() {
        while (true) {
            superMarketView.getInput();
            SuperMarketCommandType command = superMarketView.getCommandType();
            switch (command) {
                case BUY:
                    buy(superMarketView.getItemName(), superMarketView.getItemCount());
                    break;
                case GET_COUNTS:
                    getCount(superMarketView.getItemName());
                    break;
                case ADD_ITEM:
                    add_item(superMarketView.getItemName(), superMarketView.getItemCount());
                    break;
            }
        }
    }

    private void buy(String itemName, int count) {

    }

    private void getCount(String itemName) {

    }

    private void add_item(String itemName, int count) {

    }

    public void setSuperMarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void setSuperMarketView(SuperMarketView superMarketView) {
        this.superMarketView = superMarketView;
    }
}
