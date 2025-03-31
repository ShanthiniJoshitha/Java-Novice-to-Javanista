package static_classes;

public class Product_v1 {

    private long id;
    private String name;
    private int price;

    private Category category;

    public Product_v1(String name, int price, String categoryName) {

        this.id = Math.round(Math.random() * 10000);
        this.name = name;
        this.price = price;

        this.category = new Category(categoryName, this);
    }

    public void updateCategory(String name) {
        this.category.updateCategory(name);
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d, Name: %s, Price: %d, Category name: %s",
                id, name, price, category.name);
    }

    public static class Category {

        private final long id;
        private String name;
        private Product_v1 product;

        public Category(String name){
            this.id = Math.round(Math.random() * 10000);
            this.name = name;
        }

        public Category(String name, Product_v1 product) {
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
}
