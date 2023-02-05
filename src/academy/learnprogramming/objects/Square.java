package academy.learnprogramming;

public class Square implements ShapeInterface, ManageShapeInterface{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculate() {
        return area();
    }

    @Override
    public double area() {
        return side*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
