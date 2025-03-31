package static_classes;

public class Product_v2 {

    private long id;
    private String name;
    private int price;

    private Category category;
    private Rating rating;

    public Product_v2(String name, int price, String categoryName, double rating) {

        this.id = Math.round(Math.random() * 10000);
        this.name = name;
        this.price = price;

        this.category = new Category(categoryName, this);
        this.rating = new Rating(rating, this);
    }

    public void updateCategory(String name) {
        this.category.updateCategory(name);
    }

    public Category getCategory() {
        return category;
    }

    public Rating getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d, Name: %s, Price: %d, Category name: %s",
                id, name, price, category.name);
    }

    public static class Category {

        private final long id;
        private String name;
        private Product_v2 product;

        public Category(String name, Product_v2 product) {
            this.id = Math.round(Math.random() * 10000);
            this.name = name;
            this.product = product;
        }

        public void updateCategory(String name) {
            this.name = name;
        }

        public void printProductDetails() {
            System.out.println("**** Product details");
            System.out.println("ID: " + product.id);
            System.out.println("Name: " + product.name);
            System.out.println("Price: " + product.price);
            System.out.println("Category: " + product.category);
        }

        @Override
        public String toString() {
            return String.format("Category ID: %d, Name: %s", id, name);
        }
    }


    public static class Rating {

        private Product_v2 product;
        private double rating;

        public Rating(double rating, Product_v2 product) {

            this.product = product;
            this.rating = rating;
        }

        public void printRating() {
            System.out.println("****Average product rating");
            System.out.println(String.format("Product ID: %d Name: %s Rating: %.2f\n",
                    product.id, product.name, rating));

        }
    }

}
