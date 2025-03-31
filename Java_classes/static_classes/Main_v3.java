package static_classes;

public class Main_v3 {

    public static void main(String[] args) {

        Product_v1 keyboard = new Product_v1("Dell Keyboard", 49, "Computer Accessories");
        Product_v1 mouse = new Product_v1("HP Mouse", 19, "Computer Accessories");
        Product_v1 printer = new Product_v1("Epson Printer", 599, "Electronics");

        Product_v1.Category keyboardCategory = keyboard.getCategory();
        Product_v1.Category mouseCategory = mouse.getCategory();
        Product_v1.Category printerCategory = printer.getCategory();

        System.out.println("Keyboard category: " + keyboardCategory);
        System.out.println("Mouse category: " + mouseCategory);
        System.out.println("Printer category: " + printerCategory);

        System.out.println();

        // Run

        // NOTE: We can still have categories that are not associated with any product
        // i.e. standalone categories

        Product_v1.Category mobiles = new Product_v1.Category("Mobile Phones");
        Product_v1.Category home = new Product_v1.Category("Home Furnishings");

        System.out.println("Mobiles: " + mobiles);
        System.out.println("Home: " + home);

        // Run
    }
}
