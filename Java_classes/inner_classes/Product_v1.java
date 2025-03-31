package inner_classes;

import java.util.ArrayList;
import java.util.List;

public class Product_v1 {

    private final long id;
    private final String name;
    private final int price;

    private ReviewsAndRatings reviewsAndRatings;

    public Product_v1(String name, int price, double rating) {

        this.id = Math.round(Math.random() * 10000);
        this.name = name;
        this.price = price;

        this.reviewsAndRatings = new ReviewsAndRatings(rating, this);
    }

    public ReviewsAndRatings getReviewsAndRatings() {
        return reviewsAndRatings;
    }

    @Override
    public String toString() {
        return String.format("id: %l Name: %s, Price: %d, Reviews and ratings: %s",
                id, name, price, reviewsAndRatings);
    }


    public static class ReviewsAndRatings {

        private final Product_v1 product;
        private final double rating;
        private final List<String> reviews;

        public ReviewsAndRatings(double rating, Product_v1 product) {

            this.product = product;
            this.rating = rating;

            this.reviews = new ArrayList<>();
        }

        public void addReview(String review) {
            this.reviews.add(review);
        }

        @Override
        public String toString() {
            return String.format("Product: %s, rating: %.1f, reviews: %s",
                    product == null ? "<unknown>" : product.name, rating, reviews);
        }
    }

}
