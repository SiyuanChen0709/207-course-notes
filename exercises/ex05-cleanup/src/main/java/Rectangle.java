public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double area() {
        return width * height;
    }

    /**
     * scales the rectangle
     *
     * @param factor the scale that the rectangle is changed
     */
    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }

    public boolean isLargerThan(Rectangle other) {
        return this.area() > other.area();
    }
}