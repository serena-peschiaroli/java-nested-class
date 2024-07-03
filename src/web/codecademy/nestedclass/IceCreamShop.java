package web.codecademy.nestedclass;

import java.util.Scanner;

public class IceCreamShop {

    public static void main(String[] args) {
        int orderType = 0;
        Scanner input = new Scanner(System.in);
        int itemCount = 0;
        String itemName;
        ShopItems items = new ShopItems();
        ShopItems.NonVegan nonVeganItems = items.new NonVegan();
        ShopItems.Vegan veganItems = items.new Vegan();

        System.out.println("Hello! Welcome to the ice cream shop. We are ready to take your order.");
        System.out.println("For ice-cream type 1, for shakes type 2, for smoothies type 3, and for slushies type 4. If you are done ordering type 0.");
        orderType = input.nextInt();

        while (orderType != 0) {
            System.out.println("How many items of this type would you like to order?");
            itemCount = input.nextInt();

            if (orderType == 1) {
                itemName = "ice cream";
                nonVeganItems.increaseCount(1, itemCount);
            } else if (orderType == 2) {
                itemName = "shake";
                nonVeganItems.increaseCount(2, itemCount);
            } else if (orderType == 3) {
                itemName = "smoothie";
                veganItems.increaseCount(3, itemCount);
            } else if (orderType == 4) {
                itemName = "slushie";
                veganItems.increaseCount(4, itemCount);
            } else {
                System.out.println("Invalid order type. Please try again.");
                continue;
            }

            System.out.println("Adding " + itemCount + " of the item " + itemName + " to your order!");

            System.out.println("Type a number for the next item in your order:");
            System.out.println("1: Ice cream");
            System.out.println("2: Shake");
            System.out.println("3: Smoothie");
            System.out.println("4: Slushie");
            System.out.println("If you are done ordering, type 0.");
            orderType = input.nextInt();
        }

        System.out.println("Order Summary:");
        System.out.println("Total ice creams ordered: " + nonVeganItems.iceCreamCount);
        System.out.println("Total shakes ordered: " + nonVeganItems.shakeCount);
        System.out.println("Total smoothies ordered: " + veganItems.smoothieCount);
        System.out.println("Total slushies ordered: " + veganItems.slushieCount);
        System.out.println("Total non-vegan items ordered: " + nonVeganItems.totalCount);
        System.out.println("Total vegan items ordered: " + veganItems.totalCount);
        System.out.println("Total items ordered: " + items.totalCount);
        System.out.println("Thank you for your order!");

        input.close();
    }
}

