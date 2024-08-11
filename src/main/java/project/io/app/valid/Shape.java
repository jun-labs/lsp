package project.io.app.valid;

public class Shape {
    private int width;
    private int height;

    public Shape() {
    }

    public Shape(
        final int width,
        final int height
    ) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }
}
