import java.util.Scanner;

public class SuperMarketView {
    private static final String BUY = "buy";
    private static final String GET_COUNT = "get count";
    private static final String ADD_ITEM = "add item";
    private SuperMarketController controller;
    private String command;

    // fields for special commands
    private String itemName;
    private int itemCount;


    public SuperMarketView() {
        this.controller = new SuperMarketController();
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isInputValid(input))
            this.command = input;
    }

    public boolean isInputValid(String input) {
        return false;
    }

    public void showResult(String result) {
        System.out.println(result);
    }

    public SuperMarketCommandType getCommandType() {
        // process on this.input and set this.itemName and this.itemCount
        return null;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getItemName() {
        return itemName;
    }
}
