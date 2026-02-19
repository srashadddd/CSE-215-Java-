public class TestSquare {
    public static void main(String[] args) {
        Square sq1 = new Square(); 
        Square sq2 = new Square(5);

        System.out.println("Square 1:");
        System.out.println("Side = " + sq1.getSide());
        System.out.println("Area = " + sq1.getArea());
        System.out.println("Perimeter = " + sq1.getPerimeter());
        System.out.println("Diagonal = " + sq1.getDiagonal());
        System.out.println();

        System.out.println("Square 2:");
        System.out.println("Side = " + sq2.getSide());
        System.out.println("Area = " + sq2.getArea());
        System.out.println("Perimeter = " + sq2.getPerimeter());
        System.out.println("Diagonal = " + sq2.getDiagonal());
    }
}