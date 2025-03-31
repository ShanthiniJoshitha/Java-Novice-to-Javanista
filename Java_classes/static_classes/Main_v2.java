package static_classes;

public class Main_v2 {

    public static void main(String[] args) {

        Product_v2 keyboard = new Product_v2(
                "Dell Keyboard", 49, "Computer Accessories", 4.3);
        Product_v2 mouse = new Product_v2(
                "HP Mouse", 19, "Computer Accessories", 3.9);
        Product_v2 printer = new Product_v2(
                "Epson Printer", 599, "Electronics", 4.5);

        keyboard.getRating().printRating();
        mouse.getRating().printRating();
        printer.getRating().printRating();

        System.out.println();

        // Run

        Product_v2.Rating rating = new Product_v2.Rating(3.6, keyboard);
        rating.printRating();

        // Run
    }
}
