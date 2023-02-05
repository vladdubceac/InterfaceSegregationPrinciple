package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(1);
        Cube cube = new Cube(2);

        System.out.println("Square area = " + square.area());
        System.out.println("Square calculated = " + square.calculate());

        System.out.println("Cube area = " + cube.area());
        System.out.println("Cube volume = " + cube.volume());
        System.out.println("Cube calculated = " + cube.calculate());
    }
}
