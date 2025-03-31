package inner_classes;

public class Shape {

    private final String shapeType;
    private final String color;
    private final String texture;

    public Shape(String shapeType, String color, String texture) {
        this.shapeType = shapeType;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return String.format("Shape: %s, Color: %s Texture: %s",
                shapeType, color, texture);
    }

    public class Brush {

        private final String color;
        private final String texture;

        public Brush(String color, String texture) {
            this.color = color;
            this.texture = texture;
        }

        public void draw(String color, String texture) {
            System.out.println("\n****Drawing shape: " + Shape.this.shapeType);

            System.out.println("Shape's color: " + Shape.this.color);
            System.out.println("Brush's color: " + this.color);
            System.out.println("Input argument's color: " + color);

            System.out.println("Shape's texture: " + Shape.this.texture);
            System.out.println("Brush's texture: " + this.texture);
            System.out.println("Input argument's texture: " + texture);
        }
    }
}
