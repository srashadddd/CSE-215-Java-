public class Square {
    private double side;

    // Default constructor
    public Square() {
        this.side = 1;
    }

    // Parameterized constructor
    public Square(double side) {
        this.side = side;
    }

    // Setter
    public void setSide(double side) {
        this.side = side;
    }

    // Getter
    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * side;
    }
}
