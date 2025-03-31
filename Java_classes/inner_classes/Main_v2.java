package inner_classes;

public class Main_v2 {

    public static void main(String[] args) {

        Shape triangle = new Shape("triangle", "red", "glossy");
        Shape rectangle = new Shape("rectangle", "green", "glossy");
        Shape circle = new Shape("circle", "blue", "glossy");

        Shape.Brush triangleBrush = triangle.new Brush("shiny gold", "matte");
        Shape.Brush rectangleBrush =  rectangle.new Brush("shiny silver", "matte");
        Shape.Brush circleBrush = circle.new Brush("moon silver", "matte");

        triangleBrush.draw("black", "leathery");
        rectangleBrush.draw("black", "leathery");
        circleBrush.draw("black", "leathery");

        // Run

    }
}
