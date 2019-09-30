public class RegularPolygon {
    int sides;
    int sideLength;

    public RegularPolygon(int x, int y, int sides, int sideLength) {
        super(x, y);
        this.sides = sides;
        this.sideLength = sideLength;
    }

    double area() {
        double a = sideLength / (2 * Math.tan(180/points));
        return sideLength * sides * a / 2;
    }
}
