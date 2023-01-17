package overriding;
public class overriding {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        Shape circle = new Circle();
        Shape ambiguous = new Ambiguous();

        shapes[0] = circle;
        shapes[1] = ambiguous;

        for (Shape s: shapes) {
            s.printMe();
            System.out.println(s.computeArea());
        }
    }
}
