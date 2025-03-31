package inner_classes;

public class Main_v1 {

    public static void main(String[] args) {

        Product_v1 keyboard = new Product_v1(
                "Dell Keyboard", 49, 4.3);
        keyboard.getReviewsAndRatings().addReview("Very good!");

        Product_v1 mouse = new Product_v1(
                "HP Mouse", 19, 3.9);

        Product_v1 printer = new Product_v1(
                "Epson Printer", 599, 4.5);
        printer.getReviewsAndRatings().addReview("Works smoothly");

        System.out.println(keyboard);
        System.out.println(mouse);
        System.out.println(printer);

        System.out.println();

        Product_v1.ReviewsAndRatings reviewsAndRatings1 = new Product_v1.ReviewsAndRatings(4.5, null);
        Product_v1.ReviewsAndRatings reviewsAndRatings2 = new Product_v1.ReviewsAndRatings(2.5, null);

        System.out.println(reviewsAndRatings1);
        System.out.println(reviewsAndRatings2);

        System.out.println();

        // Run
    }
}
