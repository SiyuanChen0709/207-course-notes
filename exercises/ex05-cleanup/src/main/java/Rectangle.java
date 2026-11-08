/**
 * Represent a rectangle with width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
    }

  /**
   * Calculates the area of the rectangle.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
    }

  /**
   * Scales the rectangle.
   *
   * @param factor the scale that the rectangle is changed
   */
  public void scale(double factor) {
    width *= factor;
    height *= factor;
    }

  /**
   * Checks whether this rectangle has a larger area than another rectangle.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a larger area, false otherwise
   */
  public boolean isLargerThan(Rectangle other) {
        return this.area() > other.area();
    }
}