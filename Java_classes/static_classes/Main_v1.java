package static_classes;

public class Main_v1 {

    public static void main(String[] args) {

        Product_v1 keyboard = new Product_v1("Dell Keyboard", 49, "Computer Accessories");
        Product_v1 mouse = new Product_v1("HP Mouse", 19, "Computer Accessories");
        Product_v1 printer = new Product_v1("Epson Printer", 599, "Electronics");

        keyboard.getCategory().printProductDetails();
        mouse.getCategory().printProductDetails();
        printer.getCategory().printProductDetails();

        System.out.println();
    }
}
