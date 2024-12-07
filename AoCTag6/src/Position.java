import java.util.Objects;

public class Position {
    int x;
    int y;

    Orientation orientation;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
        orientation = Orientation.UP;
    }

    public Position(int x, int y, Orientation orientation){
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y && orientation == position.orientation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, orientation);
    }
}