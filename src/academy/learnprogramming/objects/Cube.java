package academy.learnprogramming;

public class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * (edge * edge);
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }

    @Override
    public double calculate() {
        return area() + volume();
    }
}
