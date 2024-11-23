package homework.day7.objects;

import java.util.Objects;

public class Chair {

    private int height;
    private int width;

    public Chair(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String toString() {
        return "Chair{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return height == chair.height && width == chair.width;
    }

    public int hashCode() {
        return Objects.hash(height, width);
    }
}
